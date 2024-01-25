package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class MyNoiseApp {

	WebDriver driver;

	@Given("^Initilize and setups$")
	public void initilize_and_setups() {
		System.setProperty("webdriver.chrome.driver", "/Users/shahnazaruzimova/Desktop/Google Chrome /chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();

	}

	@Given("^Open the app$")
	public void open_the_app() {

		driver.get("https://mynoise.net/");
		String OpenTheApp = driver.findElement(By.xpath("//h1[text()='I need to focus in a noisy environment']"))
				.getText();
		Assert.assertEquals(OpenTheApp,"I need to focus in a noisy environment","Assertion open the app");
	}

	@Then("^Choose one section$")
	public void choose_one_section() {
		driver.findElement(By.xpath("//*[@id=\"bell\"]")).click();

	}

	@When("^open the current section$")
	public void open_the_current_section() throws InterruptedException {
		driver.findElement(By.cssSelector("img[src = '/Data/JAPANGARDEN/iphone-bigthumb@2x.jpg']")).click();
		Thread.sleep(9000);

	}

	@And("^click slider speed$")
	public void click_slider_speed() throws InterruptedException {
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.cssSelector("img[src=\"/Pix/icon_speed.png\"]")).click();

			Thread.sleep(3000);

		}

	}

	@Then("^click slider mode$")
	public void click_slider_mode() throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.cssSelector("img[src=\"/Pix/icon_mode.png\"")).click();

			Thread.sleep(3000);

		}

	}
}