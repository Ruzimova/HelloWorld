package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarshallsXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.marshalls.com/us/store/account/login.jsp");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='login-id']")).sendKeys("seline@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("seline");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='loginSubmit']")).click();
    }
}
