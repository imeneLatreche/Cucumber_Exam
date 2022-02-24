package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.WelcomePage;

public class Steps {
	WebDriver driver;
	public WelcomePage wpage = new WelcomePage(driver);

	@Before
	public void setup() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/index.php");
		Thread.sleep(1500);
	}

	@Given("SetSkyBlueBackground button exists")
	public void SetSkyBlueBackground_button_exists() {
		WelcomePage wpage = new WelcomePage(driver);
		Assert.assertTrue(wpage.setSkyBlueBackgroundButton.isDisplayed(), "button not displayed");
	}

	@When("I click on the SetSkyBlueBackground button")
	public void i_click_on_the_SetSkyBlueBackground_button() throws InterruptedException {
		WelcomePage wpage = new WelcomePage(driver);
		wpage.clickSetSkyBlueBackgroundButton();
		Thread.sleep(1000);
	}
	
	@When("I click on the SetWhiteBackground button")
	public void i_click_on_the_SetWhiteBackground_button() throws InterruptedException {
		WelcomePage wpage = new WelcomePage(driver);
		wpage.clickSetWhiteBackgroundButton();
		Thread.sleep(1000);
	}


	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		String backgroundColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
		Assert.assertEquals(backgroundColor, "rgba(135, 206, 235, 1)", "Color didn't change as expected");
	}

	
	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
		String backgroundColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
		Assert.assertEquals(backgroundColor, "rgba(255, 255, 255, 1)", "Color didn't change as expected");
	}

	@Given("SetWhiteBackground button exists")
	public void setwhitebackground_button_exists() {
		WelcomePage wpage = new WelcomePage(driver);
		Assert.assertTrue(wpage.setWhiteBackgroundButton.isDisplayed(), "button not displayed");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
