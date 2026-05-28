package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginUnitTest {

    @Test
    public void testValidLogin() {
        assertTrue(LoginService.login("ahsan", "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testWrongUsername() {
        assertFalse(LoginService.login("wrong", "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testWrongPassword() {
        assertFalse(LoginService.login("ahsan", "wrong", "1990-01-01"));
    }

    @Test
    public void testWrongDob() {
        assertFalse(LoginService.login("ahsan", "ahsan_pass", "2000-01-01"));
    }

    @Test
    public void testEmptyInputs() {
        assertFalse(LoginService.login("", "", ""));
    }

    @Test
    public void testNullInputs() {
        assertFalse(LoginService.login(null, null, null));
    }
    @Test
    public void testUsernameWithSpacesStillValid() {
        assertTrue(LoginService.login(" ahsan ", " ahsan_pass ", " 1990-01-01 "));
    }

    @Test
    public void testNullUsernameOnly() {
        assertFalse(LoginService.login(null, "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testNullPasswordOnly() {
        assertFalse(LoginService.login("ahsan", null, "1990-01-01"));
    }

    @Test
    public void testNullDobOnly() {
        assertFalse(LoginService.login("ahsan", "ahsan_pass", null));
    }

    @Test
    public void testEmptyUsernameOnly() {
        assertFalse(LoginService.login("", "ahsan_pass", "1990-01-01"));
    }

    @Test
    public void testEmptyPasswordOnly() {
        assertFalse(LoginService.login("ahsan", "", "1990-01-01"));
    }

    @Test
    public void testEmptyDobOnly() {
        assertFalse(LoginService.login("ahsan", "ahsan_pass", ""));
    }

}