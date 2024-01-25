package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MarshallsDataProvider {
    WebDriver driver;
    @Test(dataProvider = "testdata")
    public void test(String[] str) throws InterruptedException {

        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

        driver.get("https://www.marshalls.com/us/store/account/login.jsp");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#login-id")).sendKeys(str[0]); // 0 column
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys(str[1]); // 1 column
        driver.findElement(By.cssSelector("#loginSubmit")).click();

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
