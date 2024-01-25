package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Kayak {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        //driver = new ChromeDriver(); comment out
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {


        driver.get("https://www.kayak.com/");
        Thread.sleep(1000);
        //choosing FLY part
        driver.findElement(By.xpath("(//div[@role='button'])[10]")).click();
        // TRAVELS
        driver.findElement(By.xpath("(//span[@class='S9tW-title'])[1]")).click();
        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='zEiP zEiP-pres-default']")).click();
        //FROM DEPARTURE
        WebElement Departure1 = driver.findElement(By.xpath("//input[@class='k_my-input']"));
        Thread.sleep(1000);
        Departure1.sendKeys("New York");
        Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
            Departure1.sendKeys(Keys.ARROW_DOWN);
        }
        Departure1.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //TO DEPARTURE
        driver.findElement(By.xpath("(//div[@role='button'])[12]")).click();
        Thread.sleep(1000);
        WebElement Departure2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        Departure2.sendKeys("Istanbul");
        Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
          Departure2.sendKeys(Keys.ARROW_DOWN);
        }
        Departure2.sendKeys(Keys.ENTER);
        //CALENDERS
        driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
        driver.findElement(By.xpath("//label[@class='Q9qx-label' and @for='MONTH']")).click();
        driver.findElement(By.xpath("//button[@class='Iqt3 Iqt3-mod-bold Button-No-Standard-Style Iqt3-mod-variant-none Iqt3-mod-theme-none Iqt3-mod-shape-rounded-medium Iqt3-mod-shape-mod-default Iqt3-mod-spacing-default Iqt3-mod-size-medium']")).click();
        driver.findElement(By.xpath("(//div[@class='mkUa mkUa-pres-mcfly mkUa-mod-colorblind'])[1]")).click();

        driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
        driver.findElement(By.xpath("(//div[@class='mkUa mkUa-pres-mcfly mkUa-mod-colorblind'])[9]")).click();

        Thread.sleep(1000);

        //direct fly button
        //driver.findElement(By.xpath("//input[@class='PVIO-input']")).click();
        //search button
        driver.findElement(By.xpath("(//div[@class='Iqt3-button-content'])[2]")).click();



        //driver.findElement(By.xpath("(//span[@role='button'])[1]")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("(//div[@class='Iqt3-button-content'])[26]")).click();
        //WebElement dateInput = driver.findElement(By.xpath("(//div[@class='mkUa mkUa-pres-mcfly mkUa-mod-colorblind'])[1]"));
        //Thread.sleep(5000);
        //dateInput.click();

//(//div[@class='wHSr wHSr-pres-mcfly'])[1]



    }

}
