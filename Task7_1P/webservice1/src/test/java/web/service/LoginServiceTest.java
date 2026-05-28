package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private WebDriver driver;

	@Before
	public void setUp() {
	    System.setProperty(
	            "webdriver.chrome.driver",
	            "/Users/lolplayer/Downloads/chromedriver-mac-arm64 2/chromedriver");

	    driver = new ChromeDriver();
	    System.out.println("Driver info: " + driver);
	}

	@After
	public void tearDown() {
	    if (driver != null) {
	        driver.quit();
	    }
	}

	@Test
	public void testLoginSuccess() {
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"file:///Users/lolplayer/Downloads/7.1P-resources/pages/login.html");
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("01/01/1990");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals("success", title);
		
		driver.close();
	}
	@Test
	public void testLoginFailWrongPassword() {

	    driver.navigate().to(
	            "file:///Users/lolplayer/Downloads/7.1P-resources/pages/login.html");

	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahsan");

	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("wrong");

	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("01/01/1990");
	    System.out.println(ele.getAttribute("value"));
	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(2);

	    String title = driver.getTitle();
	    System.out.println("Title: " + title);

	    Assert.assertEquals("fail", title);

	    driver.close();
	}
	
	@Test
	public void testLoginFailWrongDob() {

	    driver.navigate().to(
	            "file:///Users/lolplayer/Downloads/7.1P-resources/pages/login.html");

	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("ahsan");

	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_pass");

	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("01/01/2000");

	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(2);

	    String title = driver.getTitle();
	    System.out.println("Title: " + title);

	    Assert.assertEquals("fail", title);

	    driver.close();
	}
	@Test
	public void testLoginFailWrongUsername() {

	    driver.navigate().to(
	            "file:///Users/lolplayer/Downloads/7.1P-resources/pages/login.html");

	    WebElement ele = driver.findElement(By.id("username"));
	    ele.clear();
	    ele.sendKeys("wrong");

	    ele = driver.findElement(By.id("passwd"));
	    ele.clear();
	    ele.sendKeys("ahsan_pass");

	    ele = driver.findElement(By.id("dob"));
	    ele.clear();
	    ele.sendKeys("1990-01-01");

	    System.out.println(ele.getAttribute("value"));

	    ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(2);

	    String title = driver.getTitle();

	    Assert.assertEquals("fail", title);
	}

	@Test
	public void testLoginFailEmptyFields() {

	    driver.navigate().to(
	            "file:///Users/lolplayer/Downloads/7.1P-resources/pages/login.html");

	    WebElement ele = driver.findElement(By.cssSelector("[type=submit]"));
	    ele.submit();

	    sleep(2);

	    String title = driver.getTitle();

	    Assert.assertEquals("fail", title);
	}
}
