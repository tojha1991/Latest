////package StepDefinition;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.testng.Assert;
////
////import com.qa.util.waitUtil;
////
////import io.cucumber.java.en.And;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.Then;
////import io.cucumber.java.en.When;
////
////public class NewLogin_StepDef {
////
////	WebDriver driver;
////
////	@Given("enter username {string}")
////	public void enter_username(String string) throws InterruptedException {
////		driver = new ChromeDriver();
////
////		driver.get("https://www.saucedemo.com/v1/");
////
////		driver.findElement(By.id("user-name")).sendKeys(string);
////
//////		Thread.sleep(2000);
////		waitUtil.waitForSeconds(2);
////	}
////
////	@When("enter password {string}")
////	public void enter_password(String string) throws InterruptedException {
////
////		driver.findElement(By.id("password")).sendKeys(string);
////
////		Thread.sleep(2000);
////
////	}
////
////	@And("clicks on Submit button")
////	public void clicks_on_submit_button() throws InterruptedException {
////
////		driver.findElement(By.id("login-button")).click();
////
////		Thread.sleep(2000);
////	}
////
////	@Then("user is logged")
////	public void user_is_logged() {
////
////		String title = driver.getTitle();
////		String actual = "Swag Labs";
////		Assert.assertEquals(actual, title);
////		driver.quit();
////	}
////
////}
//
//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import com.qa.util.ExcelUtil;
//import com.qa.util.waitUtil;
//
//import io.cucumber.java.en.*;
//
//import java.util.Map;
//
//public class NewLogin_StepDef {
//
//    WebDriver driver;
//    Map<String, String> testData;
//
//    @Given("enter username {string}")
//    public void enter_username(String sheetName) {
//        testData = ExcelUtil.getLoginData(sheetName); // sheetName = "Login"
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/v1/");
//        driver.findElement(By.id("user-name")).sendKeys(testData.get("username"));
//        waitUtil.waitForSeconds(2);
//    }
//
//    @When("enter password from excel")
//    public void enter_password() {
//        driver.findElement(By.id("password")).sendKeys(testData.get("password"));
//        waitUtil.waitForSeconds(2);
//    }
//
//    @And("clicks on Submit button")
//    public void clicks_on_submit_button() {
//        driver.findElement(By.id("login-button")).click();
//        waitUtil.waitForSeconds(2);
//    }
//
//    @Then("user is logged")
//    public void user_is_logged() {
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Swag Labs");
//        driver.quit();
//    }
//}
//
//
//public class NewLogin_StepDef_invalid {
//
//    WebDriver driver;
//    Map<String, String> testData;
//
//    @Given("enter username {string}")
//    public void enter_username(String sheetName) {
//        testData = ExcelUtil.getLoginData(sheetName); // sheetName = "Login"
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/v1/");
//        driver.findElement(By.id("user-name")).sendKeys(testData.get("username"));
//        waitUtil.waitForSeconds(2);
//    }
//
//    @When("enter password from excel")
//    public void enter_password() {
//        driver.findElement(By.id("password")).sendKeys(testData.get("password"));
//        waitUtil.waitForSeconds(2);
//    }
//
//    @And("clicks on Submit button")
//    public void clicks_on_submit_button() {
//        driver.findElement(By.id("login-button")).click();
//        waitUtil.waitForSeconds(2);
//    }
//
//    @Then("user is logged")
//    public void user_is_logged() {
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Swag Labs");
//        driver.quit();
//    }
//}
