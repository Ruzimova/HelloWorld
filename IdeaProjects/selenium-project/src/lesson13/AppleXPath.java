package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        driver.findElement(By.xpath("//a[contains(@class,'global')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@class,'icon')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@class,'rf-productnav')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(@class,'rf-hc')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(@name,'proceed')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'button button-block')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='proceed']")).click();
    }
}
