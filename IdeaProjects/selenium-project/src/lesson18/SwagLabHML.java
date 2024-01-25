package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SwagLabHML {
    @Parameters({"username", "password"})
    @Test
    public static void main(String username, String password) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();

        System.out.println(driver.getPageSource());

       // String username = "standard_user", password = "secret_sauce";
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(1000);
        driver.findElement(By.name("user-name")).sendKeys(username);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login-button")).click();
        driver.quit();
    }

}
