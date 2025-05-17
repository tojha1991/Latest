package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid_LoginSteps {

	WebDriver driver;

	@Given("User is on login page and enters invalid username {string} into username field")
	public void user_is_on_login_page_and_enters_invalid_username_into_username_field(String string)
			throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");

		driver.findElement(By.id("user-name")).sendKeys(string);

		Thread.sleep(2000);

	}

	@When("User has entered invalid password {string} into the password field")
	public void user_has_entered_invalid_password_into_the_password_field(String string) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(string);

		Thread.sleep(2000);
	}

	@And("user clicks on the Submit button")
	public void user_clicks_on_the_submit_button() throws InterruptedException {
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
	}

	@Then("user is getting an error message on the page")
	public void user_is_getting_an_error_message_on_the_page() throws InterruptedException {

		WebElement error_msg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String actual_msg = error_msg.getText();
		String expected_msg = "Epic sadface: Username and password do not match any user in this service";

		Assert.assertEquals(actual_msg, expected_msg, "Error message is incorrect");

		Thread.sleep(2000);

		driver.quit();

	}
}
