package lesson20;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class HandleAlertPopUps {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

    }

    @org.testng.annotations.Test
    public void testAlert() throws InterruptedException {


        driver.get("https://www.letskodeit.com/practice");

        driver.findElement(By.id("alertbtn")).click();
        // Alert pupped up:
        Alert alertPopup = driver.switchTo().alert();
        String test = alertPopup.getText();
        System.out.println(test);
        alertPopup.accept();

        // Click on checkbox
        driver.findElement(By.id("bmwcheck")).click();

    }

    @Test
    public void testIFrames() {
        driver.get("https://www.letskodeit.com/practice");

        // Click on checkbox
        driver.findElement(By.id("bmwcheck")).click();

        // Write into search box of iframe
//    driver.switchTo().frame(0);
//        driver.switchTo().frame("courses-iframe");
          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.letskodeit.com/courses']")));
//        driver.findElement(By.id("search")).click();
//        driver.findElement(By.id("search")).sendKeys("test");
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();

        // Click on checkbox
//        driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("benzcheck")).click();

    }

    // Handling child windows:
    @Test
    public void handlingChildWindows() {
        driver.get("https://www.letskodeit.com/practice");

        String parentWinId = driver.getWindowHandle();
        System.out.println("Parent Id:" + parentWinId);

        // Open the child window
        driver.findElement(By.id("openwindow")).click();

        Set<String> winHandles = driver.getWindowHandles();
        System.out.println("All ids" + winHandles);
        String childWinId = null;
        for(String id : winHandles) {
            childWinId = id;
        }

        driver.switchTo().window(childWinId);
        // Sign in inside child window
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//        driver.close();
        driver.quit();

//        driver.switchTo().window(parentWinId);
//
//        driver.findElement(By.id("benzcheck")).click();
    }
}
