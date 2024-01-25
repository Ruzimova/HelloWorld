package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'pas')]")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }
}
