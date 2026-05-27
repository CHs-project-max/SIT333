package sit707_week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BunningsLoginTest {

    private WebDriver driver;

    private final String VALID_EMAIL = "";
    private final String VALID_PASSWORD = "";

    @Before
    public void setup()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.bunnings.com.au/login");
    }

    @After
    public void teardown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

    private void enterLoginDetails(String usernameValue, String passwordValue)
	{
		WebElement username =
		driver.findElement(
		 By.name("username")
		);
		
		WebElement password =
		driver.findElement(
		 By.name("password")
		);
		
		username.clear();
		password.clear();
		
		username.sendKeys(usernameValue);
		password.sendKeys(passwordValue);
		
		password.sendKeys(Keys.ENTER);
	}

    @Test
    public void testStudentIdentity()
    {
        String studentId = "s224639721";

        Assert.assertNotNull(
                "Student ID is null",
                studentId);
    }

    @Test
    public void testStudentName()
    {
        String studentName = "Chhay Hout Lay";

        Assert.assertNotNull(
                "Student name is null",
                studentName);
    }

    @Test
    public void testPageLoads()
    {
        String currentUrl =
                driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("bunnings.com.au"));
    }

    @Test
    public void testEmptyEmailEmptyPassword()
    {
        enterLoginDetails(
                "",
                "");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testEmptyEmailWrongPassword()
    {
        enterLoginDetails(
                "",
                "wrongpassword");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testWrongEmailEmptyPassword()
    {
        enterLoginDetails(
                "wrong@email.com",
                "");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testWrongEmailWrongPassword()
    {
        enterLoginDetails(
                "wrong@email.com",
                "wrongpassword");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testCorrectEmailEmptyPassword()
    {
        enterLoginDetails(
                VALID_EMAIL,
                "");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testCorrectEmailWrongPassword()
    {
        enterLoginDetails(
                VALID_EMAIL,
                "wrongpassword");

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"));
    }

    @Test
    public void testCorrectEmailCorrectPassword()
    {
        enterLoginDetails(
                VALID_EMAIL,
                VALID_PASSWORD);

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        String currentUrl =
                driver.getCurrentUrl();

        System.out.println(
                "Current URL: " + currentUrl);

        Assert.assertNotNull(currentUrl);
    }
}