package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class KiwiMinus {
    WebDriver driver = null;


    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

    }


    @org.testng.annotations.Test
    public void test1() throws InterruptedException {



        driver.get("https://www.kiwi.com/");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
        Thread.sleep(500);
        WebElement Departure1 = driver.findElement(By.xpath("(//input[@data-test='SearchField-input'])[1]"));
        Thread.sleep(500);
        Departure1.sendKeys("New York");
    }
}
