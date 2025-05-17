//package StepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Backgroundkey_Steps {
//	WebDriver driver;
//
//	@Given("User enters Valid username {string} and valid password {string}")
//	public void user_enters_Valid_username_and_valid_password(String string, String string2) {
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//
//		driver.findElement(By.id("user-name")).sendKeys(string);
//
//		driver.findElement(By.id("password")).sendKeys(string2);
//
//	}
//
//	@When("User clicks on login button")
//	public void user_clicks_on_login_button1() {
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("User is on Homepage of the app")
//	public void user_is_on_homepage_of_the_app() throws InterruptedException {
//		Thread.sleep(4000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		
//		String actual_title = driver.getTitle();
//		String expected_title = "Swag Labs";
//		Assert.assertEquals(actual_title, expected_title, "Title matched");
//		Thread.sleep(10000);
//
//
//	}
//
//	@When("user is on Homepage")
//	public void user_is_on_homepage1() throws InterruptedException {
//		String current_url = driver.getCurrentUrl();
//		String expected_url = "https://www.saucedemo.com/v1/inventory.html";
//
//		Assert.assertEquals(current_url, expected_url, "URL matched");
//
//		Thread.sleep(2000);
//	}
//
//	@When("user is able to see the Homepage Title")
//	public void user_is_able_to_see_the_homepage_title() throws InterruptedException {
//
//		Thread.sleep(4000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		
//		String actual_title = driver.getTitle();
//		String expected_title = "Swag Labs";
//		Assert.assertEquals(actual_title, expected_title, "Title matched");
//	
//	}
//
//	@Given("user is on Homepage")
//	public void user_is_on_homepage() throws InterruptedException {
//		String current_url = driver.getCurrentUrl();
//		String expected_url = "https://www.saucedemo.com/v1/inventory.html";
//
//		Assert.assertEquals(current_url, expected_url, "URL matched");
//
//		Thread.sleep(2000);
//
//	}
//
//	@Given("user clicks on Hamburger menu")
//	public void user_clicks_on_hamburger_menu() throws InterruptedException {
//
//		WebElement Menu_hover = driver.findElement(By.id("react-burger-menu-btn"));
//		Menu_hover.click();
//		
//		Thread.sleep(2000);
//
//	}
//
//	@And("user is clicks on logout link")
//	public void user_is_clicks_on_logout_link() throws InterruptedException {
//		
//
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement subMenuItem = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link']")));
//
//		subMenuItem.click();
//		
//		Thread.sleep(2000);
//
//		driver.quit();
//
//	}
//
//	@Then("user is logged out of the application")
//	public void user_is_logged_out_of_the_application() throws InterruptedException {
//		String current_url = driver.getCurrentUrl();
//		String expected_url = "https://www.saucedemo.com/v1/index.html";
//
//		Assert.assertEquals(current_url, expected_url, "URL matched");
//
//		Thread.sleep(2000);
//
//		driver.quit();
//	}
//	
//	@Given("User is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.get("https://www.saucedemo.com/v1/");
//		
//		WebElement login_button=driver.findElement(By.id("login-button"));
//		
//		String button_text=login_button.getText();
//		
//		String act_buttontxt="Login";
//		
//		Assert.assertEquals(button_text, act_buttontxt,"Text matched");
//		
//		Thread.sleep(2000);
//	}
//
//	@When("User enters Valid username {string} and valid password {string}")
//	public void user_enters_valid_username_and_valid_password(String string, String string2) throws InterruptedException {
//		driver.findElement(By.id("user-name")).sendKeys(string);
//		driver.findElement(By.id("password")).sendKeys(string2);
//		Thread.sleep(2000);	
//
//	}
//
//	@And("User clicks on login button")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("Homepage should be displayed")
//	public void homepage_should_be_displayed() throws InterruptedException {
//		String current_url = driver.getCurrentUrl();
//		String expected_url = "https://www.saucedemo.com/v1/inventory.html";
//
//		Assert.assertEquals(current_url, expected_url, "URL matched");
//	
//		Thread.sleep(2000);
//		
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//
//		
//
//	}
//
//	@When("User is on Hompepage")
//	public void user_is_on_hompepage() throws InterruptedException {
//
//		String title=driver.getTitle();
//		String actual="Swag Labs";
//		Assert.assertEquals(actual, title);
//		Thread.sleep(4000);
//
//		
//		driver.quit();
//
//	}
//
//	@Then("Title of the Homepage should be shown")
//	public void title_of_the_homepage_should_be_shown() {
//	   
//	}
//
//	@Given("User Hovers to the Hamburger menu")
//	public void user_hovers_to_the_hamburger_menu() throws InterruptedException {
//		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement Menu_hover=driver.findElement(By.xpath("//button[text()='Open Menu']"));
//		WebElement Menu_hover = driver.findElement(By.id("react-burger-menu-btn"));
//		Menu_hover.click();
//		
//		Thread.sleep(4000);
//	}
//
//	@And("User clicks on Logout link")
//	public void user_clicks_on_logout_link() throws Exception  {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement subMenuItem = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link']")));
//
//		subMenuItem.click();
//		
//		Thread.sleep(2000);
//
//		driver.quit();
//	}
//
//	@Then("User should be logged out of the application")
//	public void user_should_be_logged_out_of_the_application() throws InterruptedException {
//		String current_url = driver.getCurrentUrl();
//		String expected_url = "https://www.saucedemo.com/";
//
//		Assert.assertEquals(current_url, expected_url, "URL matched");
//		Thread.sleep(2000);
//		
//		driver.quit();
//	}
//}
