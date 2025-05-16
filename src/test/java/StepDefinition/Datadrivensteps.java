//package StepDefinition;
//
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Datadrivensteps {
//	
//	WebDriver driver;
//	@Given("user is on login screen")
//	public void user_is_on_login_screen() {
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.saucedemo.com/v1/");
//	}
//
//    @When("user enters {string} in username field and {string} in password field")
//	public void user_enters_in_username_field_and_in_password_field(String Username, String Password) {
//		driver.findElement(By.name("user-name")).sendKeys(Username);
//		   driver.findElement(By.name("password")).sendKeys(Password);
//	}
//
//	@When("click on Submit button")
//	public void click_on_submit_button() throws InterruptedException {
//		driver.findElement(By.id("login-button")).click();
//		   Thread.sleep(2000);
//	}
//
//	@Then("user is able to login into the application")
//	public void user_is_able_to_login_into_the_application() throws InterruptedException {
//    String url=driver.getCurrentUrl();
//		
//		System.out.println(url);
//		
//		Thread.sleep(2000);
//		
//		driver.quit();
//
//	}
//
//}
