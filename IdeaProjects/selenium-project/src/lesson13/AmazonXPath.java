package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//span[contains(text(),'Hello')]")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("3473072323");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("step2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

    }
}
