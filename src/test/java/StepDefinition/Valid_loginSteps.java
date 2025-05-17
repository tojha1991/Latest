package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Valid_loginSteps {

	WebDriver driver;

	@Given("User is on login page and enters valid username {string} into username field")
	public void user_is_on_login_page_and_enters_valid_username_into_username_field(String string) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.id("user-name")).sendKeys(string);
		
		Thread.sleep(2000);
	}

@When("User has entered valid password {string} into the password field")
	public void user_has_entered_valid_password_secret_sauce_into_the_password_field(String string) throws InterruptedException {
		
		driver.findElement(By.id("password")).sendKeys(string);

		Thread.sleep(2000);

	}

	@And("user clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {

		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);

	}

	@Then("user is able to logged into the application successfully")
	public void user_is_able_to_logged_into_the_application_successfully() {

		String title=driver.getTitle();
		String actual="Swag Labs";
		Assert.assertEquals(actual, title);
		driver.quit();
		
	}

}
