package lesson20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PupUps {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

    }

    @org.testng.annotations.Test
    public void testAlert() throws InterruptedException {


        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("confirmbtn")).click();
        // Alert pupped up:
        Alert alertPopup = driver.switchTo().alert();
        String test = alertPopup.getText();
        System.out.println(test);
        alertPopup.dismiss();

        driver.findElement(By.id("opentab")).click();

    }
    @Test
    public void testIFrames() {
        driver.get("https://codepen.io/SnapToPixels/pen/BjgvRM");

        // Click on checkbox
       // driver.findElement(By.id("bmwcheck")).click();

        // Write into search box of iframe
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("(//div[@class='CodeMirror-scroll'])[2]")).sendKeys("CSS celector with X-path");
//        driver.switchTo().frame("courses-iframe");
        //driver.switchTo().frame(driver.findElement(By.xpath("https://www.amazon.com")));
//        driver.findElement(By.id("search")).click();
//        driver.findElement(By.id("search")).sendKeys("test");
       // driver.findElement(By.xpath("//a[text()='Sign In']")).click();

        // Click on checkbox
//        driver.switchTo().defaultContent();
       // driver.switchTo().parentFrame();
        //driver.findElement(By.id("benzcheck")).click();

    }
}
