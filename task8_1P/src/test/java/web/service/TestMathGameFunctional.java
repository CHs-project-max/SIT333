package web.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMathGameFunctional {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/lolplayer/Downloads/chromedriver-mac-arm64 2/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void testValidLoginShowsQ1() {
		driver.get("http://127.0.0.1:8080/login");

		driver.findElement(By.name("username")).sendKeys("ahsan");
		driver.findElement(By.name("passwd")).sendKeys("ahsan_pass");
		driver.findElement(By.name("dob")).sendKeys("2000-01-01");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Assert.assertTrue(driver.getCurrentUrl().contains("/q1"));
	}

	@Test
	public void testInvalidLoginShowsError() {
		driver.get("http://127.0.0.1:8080/login");

		driver.findElement(By.name("username")).sendKeys("wrong");
		driver.findElement(By.name("passwd")).sendKeys("wrong");
		driver.findElement(By.name("dob")).sendKeys("2000-01-01");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Assert.assertTrue(driver.getPageSource().contains("Incorrect credentials"));
	}

	@Test
	public void testQ3WrongAndCorrectAnswer() {
		driver.get("http://127.0.0.1:8080/q3");

		driver.findElement(By.name("result")).sendKeys("19");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Assert.assertTrue(driver.getPageSource().contains("Wrong"));

		driver.findElement(By.name("result")).clear();
		driver.findElement(By.name("result")).sendKeys("20");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Assert.assertTrue(driver.getPageSource().contains("Game completed"));
	}
}