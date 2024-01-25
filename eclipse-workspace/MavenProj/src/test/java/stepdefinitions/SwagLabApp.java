package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SwagLabApp {
	WebDriver driver;

	@Given("Login page is open")
	public void login_page_is_open() {

		System.setProperty("webdriver.chrome.driver", "/Users/shahnazaruzimova/Desktop/Google Chrome /chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
	}

	@When("User inserts valid credentials and click login")
	public void user_inserts_valid_credentials_and_click_login() {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

	@Then("User logs in and home page should open")
	public void user_logs_in_and_home_page_should_open() {
		System.out.println("Then is running");

	}
}
