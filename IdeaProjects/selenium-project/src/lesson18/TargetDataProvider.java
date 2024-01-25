package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TargetDataProvider {
    WebDriver driver;

    @Test(dataProvider = "testdata")
    public void test(String[] str) throws InterruptedException {

        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

        driver.get("https://www.target.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#username")).sendKeys(str[0]);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#password")).sendKeys(str[1]);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#login")).click();
    }

    @DataProvider(name = "testdata")
    public String[][] dataSupplier() { // array
        String[][] data = {
                {"shahnaza.ruzimova@gmail.com", "Yannaz.95"},
                {"shahnaza.ruzimova@gmail.com", "Yannaz.95"}

        };
        return data;
    }
}
