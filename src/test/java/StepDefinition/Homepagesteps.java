//package StepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Homepagesteps {
//	
//
//	WebDriver driver;
//	@Given("User is on OrangeHRMlogin page")
//	public void user_is_on_orange_hr_mlogin_page() {
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    
//	}
//
//	@When("User enters Valid username {string} and password {string}")
//	public void user_enters_valid_username_and_password(String string, String string2) throws InterruptedException {
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		   driver.findElement(By.name("password")).sendKeys("admin123");
//	  
//	}
//
//	@And("User clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	  
//	}
//
//	@Then("User should be login to the application")
//	public void user_should_be_login_to_the_application() {
//		String curr_url1=driver.getCurrentUrl();
//		String expc_url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//		
//		if(curr_url1.equals(expc_url1)) {
//			System.out.println("Expected URL is matching with Current URL");
//		}
//		else {
//			System.out.println("Expected URL is not matching with Current URL");
//		}
//	    
//	}
//
//	@Given("User clicks on Leave pannel")
//	public void user_clicks_on_leave_pannel() throws InterruptedException {
//		driver.findElement(By.xpath("//span[text()='Leave']")).click();
//	   
//	}
//
//	@Then("Search button is displayed")
//	public void search_button_is_displayed() throws InterruptedException {
//	boolean submit_disp=	driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
//
//	if(submit_disp==true) {
//		System.out.println("Search button is displayed");
//	}
//	
//	else {
//		System.out.println("Search button is not displayed");
//	}
//	
//	
//	}
//
//	@Given("User clicks on Image icon")
//	public void user_clicks_on_image_icon() throws InterruptedException {
//		driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
//
//	   
//	}
//
//	@And("User clicks on logout link")
//	public void user_clicks_on_logout_link() throws InterruptedException {
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//
//	    
//	}
//
//	@Then("user is logged out from application successfully")
//	public void user_is_logged_out_from_application_successfully() throws InterruptedException {
//		String curr_url=driver.getCurrentUrl();
//
//        String expc_url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		
//		if(curr_url.equals(expc_url)) {
//			System.out.println("Expected URL is Login page");
//		}
//		else {
//			System.out.println("Expected URL is not a Login page");
//		}
//		
//		Thread.sleep(2000);
//		driver.quit();
//		
//	}
//
//}
