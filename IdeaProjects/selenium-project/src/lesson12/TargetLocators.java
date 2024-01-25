package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLocators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");

        System.out.println(driver.getPageSource());
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        //(//span[contains(@class,'styles__ListItemText-sc-diphzn-1 jaMNVl')])[2]

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
        WebElement elementName = driver.findElement(By.id("username"));
        elementName.sendKeys("shahnaza.ruzimova@gmail.com");

        driver.findElement(By.id("password")).sendKeys("Yannaz.95");
        Thread.sleep(2000);
        driver.findElement(By.id("keepMeSignedIn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();

       // driver.findElement(By.className(""));
       // driver.findElement(By.name(""));
       // driver.findElement(By.xpath(""));
       // driver.findElement(By.cssSelector(""));
       // driver.findElement(By.linkText(""));
       // driver.findElement(By.partialLinkText(""));
    }
}
