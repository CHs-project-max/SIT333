package sit333;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty(
            "webdriver.chrome.driver",
            "/Users/lolplayer/Downloads/chromedriver-mac-arm64 2/chromedriver"

        );

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}