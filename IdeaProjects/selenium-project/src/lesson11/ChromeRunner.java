package lesson11;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeRunner {
    public static void main(String[] args) throws InterruptedException {

        // Driver location:
        // key=value,  name=london

        System.setProperty("webdriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver =  new ChromeDriver(); // opens chrome browser

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Move the window to left screen: (do not do it)
        //driver.manage().window().setPosition(new Point(-1800, 0));
        // Interacting with chrome browser:
        // 1] Open certain URL:
        driver.get("https://www.amazon.com/");

        // pause:
        Thread.sleep(2000);

        // switch one url to another url
        driver.navigate().to("https://google.com");
        Thread.sleep(1000);

        // going back to privies page
        driver.navigate().back();
        Thread.sleep(1000);

        // going forward (again going back)
        driver.navigate().forward();
        Thread.sleep(1000);

        // refresh button
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().refresh();

        // close the window:
        // driver.close();

        // quit the window: control Q (giving you documentation)
        driver.quit();




    }
}
