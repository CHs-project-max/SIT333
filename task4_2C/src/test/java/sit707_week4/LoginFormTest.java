package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "s224639721";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Chhay Hout Lay";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */
	@Test
	public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode()
	{
	    LoginStatus status = LoginForm.login(null, "xyz");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode()
	{
	    LoginStatus status = LoginForm.login("abc", "xyz");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode()
	{
	    LoginStatus status = LoginForm.login("ahsan", null);
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Password", status.getErrorMsg());
	}

	@Test
	public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode()
	{
	    LoginStatus status = LoginForm.login("ahsan", "xyz");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode()
	{
	    LoginStatus status = LoginForm.login(null, "ahsan_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode()
	{
	    LoginStatus status = LoginForm.login("abc", "ahsan_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void testLoginSuccessAndEmptyValidationCode()
	{
	    LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	    Assert.assertTrue(status.isLoginSuccess());

	    boolean validCode = LoginForm.validateCode(null);
	    Assert.assertFalse(validCode);
	}

	@Test
	public void testLoginSuccessAndWrongValidationCode()
	{
	    LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	    Assert.assertTrue(status.isLoginSuccess());

	    boolean validCode = LoginForm.validateCode("abcd");
	    Assert.assertFalse(validCode);
	}

	@Test
	public void testLoginSuccessAndCorrectValidationCode()
	{
	    LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    Assert.assertEquals("123456", status.getErrorMsg());

	    boolean validCode = LoginForm.validateCode("123456");
	    Assert.assertTrue(validCode);
	}
}
