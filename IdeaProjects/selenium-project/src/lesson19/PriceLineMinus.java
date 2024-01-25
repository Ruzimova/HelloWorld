package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class PriceLineMinus {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

    }

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {


        driver.get("https://www.priceline.com/");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[contains(@style,'border:2px')])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]")).sendKeys("New York");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//input[contains(@id,'flights.0.')])[2]")).sendKeys("İstanbul");
    }
}
