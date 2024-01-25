package lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class usingDataProvider {

    @Test(dataProvider = "user-credentials")
    public void testUsingDataProvider1(String username, String password) throws InterruptedException {


        System.setProperty("WebDriver.chrome,driver", "/users/shahnazaruzimova/Desktop/GoogleChrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);


        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

    // This data can be pulled from DB/ExcelSheet/Or any other  resources
    @DataProvider(name = "user-credentials")
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "user1";
        data[0][1] = "password1";

        //data[1][0]= "user2";
        // data[1][1]= "password2";

        //  data[2][0]= "user3";
        // data[2][1]= "password3";

        return data;

    }
}
