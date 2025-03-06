//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//	
//	
//	WebDriver driver;
//	@Given("User is on login page")
//	public void User_is_on_login_page() {
//		driver=new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//	    
//	}
//
//	@When("User enters correct username {string} and password {string}")
//	public void User_enters_correct_username_and_password(String string,String string2) {
//	   driver.findElement(By.name("user-name")).sendKeys("standard_user");
//	   driver.findElement(By.name("password")).sendKeys("secret_sauce");
//	}
//
//	@And("clicks on Submit button")
//	public void clicks_on_submit_button() throws InterruptedException {
//	    driver.findElement(By.id("login-button")).click();
//	   Thread.sleep(2000);
//	}
//
//	@Then("User should be able to login to the application without any error")
//	public void User_should_be_able_to_login_to_the_application_without_any_error() throws InterruptedException {
//		String url=driver.getCurrentUrl();
//		
//		System.out.println(url);
//		
//		Thread.sleep(2000);
//		
//		driver.quit();
//
//		
//	}	
//
//}
