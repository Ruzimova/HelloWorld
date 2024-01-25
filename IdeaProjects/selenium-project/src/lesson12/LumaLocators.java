package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LumaLocators {



    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.id("email")).sendKeys("shahnaza.ruzimova@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Yannaz.95");
        driver.findElement(By.id("send2")).click();

        //driver.quit();
    }
}
