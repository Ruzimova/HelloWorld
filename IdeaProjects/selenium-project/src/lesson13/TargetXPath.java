package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetXPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");

        System.out.println(driver.getPageSource());
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        //(//span[contains(@class,'styles__ListItemText-sc-diphzn-1 jaMNVl')])[2]

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shahnaza.ruzimova@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Yannaz");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='keepMeSignedIn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='login']")).click();
    }
}
