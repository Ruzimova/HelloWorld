package lesson19;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;


public class CheapOair {
    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("WebDriver.chrome,driver", "/Users/shahnazaruzimova/Desktop/GoogleChrome");
        driver = new ChromeDriver();

    }

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {


        driver.get("https://www.cheapoair.com/");
        //driver.findElement(By.id("from0")).sendKeys("new york");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@aria-label='clear field'])[1]")).click();
        WebElement box1 = driver.findElement(By.xpath("//input[@id='from0']"));
        box1.sendKeys("New York");
        Thread.sleep(1000);
        for(int i = 0; i<5; i++) {
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        box1.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//a[@aria-label='clear field'])[2]")).click();
        WebElement box2 = driver.findElement(By.id("to0"));
        box2.sendKeys("ISTANBUL");
        Thread.sleep(1000);
        Thread.sleep(1000);
        for(int i = 0; i<1; i++) {
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        box1.sendKeys(Keys.ENTER);

        // Select departure date:
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class=' month-date'])[6]")).click();

        // Select travellers
        driver.findElement(By.id("travellerButton")).click();
        Thread.sleep(500);

        // add child
        driver.findElement(By.id("addchild")).click();

        Select childAgeDrpDown = new Select(driver.findElement(By.name("ChildrenAge")));
//        childAgeDrpDown.selectByIndex(1);
        childAgeDrpDown.selectByValue("6");

    }
}
