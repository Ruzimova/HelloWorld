package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagDataProvider {
    WebDriver driver;

    @Test(dataProvider = "testdata")
    public void test(String[] str) throws InterruptedException {

        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys(str[0]); // 0 column
        driver.findElement(By.id("password")).sendKeys(str[1]);  // 1 column
        driver.findElement(By.id("login-button")).click();

    }

    @DataProvider(name = "testdata")
    public String[][] dataSupplier() { // array
        String[][] data = {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "12345"},
                {"hhbkjbkj", "hbjbkjds"}
        };
        return data;
    }
}
