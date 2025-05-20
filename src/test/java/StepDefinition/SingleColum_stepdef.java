//package StepDefinition;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//
//public class SingleColum_stepdef {
//
//	WebDriver driver;
//	@Given("user enables the feature flags")
//	public void user_enables_the_feature_flags(DataTable dataTable) {
//		
//		List<String> data=	dataTable.asList();
//		for(String s:data) {
//			System.out.println("Value of s flags are "+ s);
//		}
//	}
//	
//}
