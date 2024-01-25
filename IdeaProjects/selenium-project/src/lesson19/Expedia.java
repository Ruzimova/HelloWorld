package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Expedia {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        //driver = new ChromeDriver(); comment out
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {


        driver.get("https://www.expedia.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='uitk-tab-text'])[2]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).sendKeys("New York");
    }
}
