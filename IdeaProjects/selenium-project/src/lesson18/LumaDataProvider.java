package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LumaDataProvider {
    WebDriver driver;

    @Test(dataProvider = "testdata")
    public void test(String[] str) throws InterruptedException {

        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys(str[0]);  // 0 column
        driver.findElement(By.cssSelector("#pass")).sendKeys(str[1]);   // 1 column
        driver.findElement(By.cssSelector("#send2")).click();


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
