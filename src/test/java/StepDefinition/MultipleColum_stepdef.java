//package StepDefinition;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//
//public class MultipleColum_stepdef {
//
//	WebDriver driver;
//
//	@Given("user enables the feature flags")
//	public void user_enables_the_feature_flags(DataTable dataTable) {
//
////		List<String> data = dataTable.asList();
////		for(String s:data) {
////			System.out.println("Value of s flags are "+ s);
//
//		List<List<String>> flags = dataTable.asLists();
//
//		for (List<String> row : flags) {
//
//			for (String column : row) {// String is Data type name and s is ref variable and row is for which loop is applied
//				System.out.println(column + "\t");// here t is used in order to print in tabs
//			}
//			System.out.println();// here println is taken in order to print values in the next line
//
//		}
//
//	}
//}
