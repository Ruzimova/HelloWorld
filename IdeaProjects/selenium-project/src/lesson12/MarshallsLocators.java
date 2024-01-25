package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarshallsLocators {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.marshalls.com/us/store/account/login.jsp");

        driver.findElement(By.id("login-id")).sendKeys("shahnaza.ruzimova@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Yannaz.95");
        driver.findElement(By.id("loginSubmit")).click();


    }
}
