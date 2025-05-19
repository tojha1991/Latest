//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DDTest_Scenariootln {
//
//	WebDriver driver;
//
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//		driver = new ChromeDriver();
//
//		driver.get("https://www.saucedemo.com/v1/");
//
//		driver.manage().window().maximize();
//	}
//
//	@When("user enter (.*) and (.*)$")
//	public void user_enter_and(String uname, String pwd) throws InterruptedException {
//
//		driver.findElement(By.id("user-name")).sendKeys(uname);
//
//		driver.findElement(By.id("password")).sendKeys(pwd);
//
//		Thread.sleep(3000);
//	}
//
//	@And("click on Submit button")
//	public void click_on_submit_button() {
//
//		driver.findElement(By.id("login-button")).click();
//
//	}
//
//	@Then("user able to log in")
//	public void user_able_to_log_in() throws InterruptedException {
//
//		String title = driver.getTitle();
//		String actual = "Swag Labs";
//		Assert.assertEquals(actual, title);
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
//
//}
