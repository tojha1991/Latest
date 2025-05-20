//package StepDefinition;
//
//import java.util.List;
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
//import io.cucumber.datatable.DataTable;
//
//public class Datatble_Stepdef {
//
//	WebDriver driver;
//	@Given("A user is on the login page")
//	public void a_user_is_on_the_login_page() {
//		driver = new ChromeDriver();
//
//		driver.get("https://www.saucedemo.com/v1/");
//
//		driver.manage().window().maximize();
//	}
//
//	@When("a user enters credentials using datatable")
//	public void a_user_enters_credentials_using_datatable(DataTable dataTable) {
//
//		List<List<String>> data=dataTable.cells();
//		driver.findElement(By.name("user-name")).sendKeys(data.get(0).get(0));
//		   driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//
//	}
//
//	@And("it click on Submit button")
//	public void it_click_on_submit_button() {
//		driver.findElement(By.id("login-button")).click();
//
//	}
//
//	@Then("user should be able to log in")
//	public void user_should_be_able_to_log_in() throws InterruptedException {
//		String title = driver.getTitle();
//		String actual = "Swag Labs";
//		Assert.assertEquals(actual, title,"Title matched");
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
//	
//	
//}
