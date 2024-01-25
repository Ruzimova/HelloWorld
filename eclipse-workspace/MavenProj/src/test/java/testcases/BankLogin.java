package testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankLogin {

	Properties prop = null;
	String url = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
	WebDriver driver;
	String username = "naza";
	String password = "naza";

	@BeforeMethod
	public void setup() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/java/resourses/application.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.setProperty("webdriver.chrome.driver",
				"/Users/shahnazaruzimova/Desktop/Google Chrome /2021/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void login() {

		driver.get(prop.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();

		String homePageTitle = driver.findElement(By.cssSelector("#rightPanel > div > div > h1")).getText();

		Assert.assertEquals(homePageTitle, "Accounts Overview");
	}

	@Test
	public void applyForLoan() {

		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(5) > input")).click();

		String homePageTitle = driver.findElement(By.cssSelector("#rightPanel > div > div > h1")).getText();

		Assert.assertEquals(homePageTitle, "Accounts Overview");
		//

		driver.findElement(By.xpath("//a[text()='Request Loan']")).click();
		String LoanPageTitle = driver.findElement(By.cssSelector("h1.title")).getText();

		Assert.assertEquals(LoanPageTitle, "Apply For a Loan");

		driver.findElement(By.id("amount")).sendKeys("1000000");

		driver.findElement(By.id("downPayment")).sendKeys("150000");
		driver.findElement(By.cssSelector("input[value='Apply Now']")).click();
	}

}
