package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LumaHML {
    @Parameters({"username", "password"})
    @Test
    public static void main(String username, String password) throws InterruptedException {
        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();

        System.out.println(driver.getPageSource());

        // String username = "standard_user", password = "secret_sauce";
        driver.get("https://magento.softwaretestingboard.com/");

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#email")).sendKeys(username);  // 0 column
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pass")).sendKeys(password);   // 1 column
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
}
