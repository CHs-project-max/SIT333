package sit707_week2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), new File(fileName).toPath());
            System.out.println("Screenshot saved: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/lolplayer/Downloads/chromedriver-mac-arm64 2/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get(url);
            sleep(3);

            driver.findElement(By.id("firstname")).sendKeys("Chhay Hout");
            driver.findElement(By.id("lastname")).sendKeys("Lay");
            driver.findElement(By.id("email")).sendKeys("s224639721@deakin.edu.au");
            driver.findElement(By.id("phoneNumber")).sendKeys("0450535725");

            // Intentionally weak password so account is NOT created
            driver.findElement(By.id("password")).sendKeys("abc");
            driver.findElement(By.id("confirmPassword")).sendKeys("abc");

            sleep(1);

            WebElement createButton = driver.findElement(By.xpath("//button[contains(text(),'Create account')]"));
            createButton.click();

            sleep(3);

            takeScreenshot(driver, "officeworks_registration_result.png");

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot(driver, "officeworks_error.png");
        } finally {
            sleep(2);
            driver.close();
        }
    }

    public static void testing_registration_page(String url) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/lolplayer/Downloads/chromedriver-mac-arm64 2/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get(url);
            sleep(3);

            driver.findElement(By.id("firstname")).sendKeys("Chhay Hout");
            driver.findElement(By.id("lastname")).sendKeys("Lay");
            driver.findElement(By.id("username")).sendKeys("Chhay Hout Lay");

            // Intentionally weak password so account is NOT created
            driver.findElement(By.id("password")).sendKeys("abc");

            sleep(1);

            WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
            registerButton.click();
            sleep(3);
            takeScreenshot(driver, "testing_registration_result.png");

            

        } catch (Exception e) {
            e.printStackTrace();
            takeScreenshot(driver, "testing_error.png");
        } finally {
            sleep(2);
            driver.close();
        }
    }
}