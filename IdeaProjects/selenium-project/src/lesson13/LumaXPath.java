package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LumaXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("step1@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("step2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();

    }
}
