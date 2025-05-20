//package StepDefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeAll;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class CcmbrHooksBfrAfter {
//
//	WebDriver driver;
//
//	@BeforeAll
//	public static void VPN_Connect_Started() {
//		System.out.println("VPN connected");
//	}
//	@Before
//	public void setUp() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().window().maximize();
//
//	}
//
//	@BeforeStep
//	public void testCaseStarted() {
//		System.out.println("Test case execution started");
//	}
//	
////	@Given("user is on the login page")
////	public void user_is_on_the_login_page() {
////		driver = new ChromeDriver();
////
////		driver.get("https://www.saucedemo.com/v1/");
////
////		driver.manage().window().maximize();
////	}
//
//	@Given("user enter (.*) and (.*)$")
//	public void user_enter_and(String uname, String pwd) throws InterruptedException {
//
//		driver.findElement(By.id("user-name")).sendKeys(uname);
//
//		driver.findElement(By.id("password")).sendKeys(pwd);
//
//		Thread.sleep(2000);
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
//		Thread.sleep(2000);
//
//	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
//
//	@AfterStep
//	public void testCaseFinished() {
//		System.out.println("Test case Execution finished");
//	}
//	
//	@AfterAll
//	public static void VPN_Disconnected() {
//		System.out.println("VPN diconnected");
//	}
//}
