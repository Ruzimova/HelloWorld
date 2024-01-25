package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLocators {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //driver.quit();

    }
}
