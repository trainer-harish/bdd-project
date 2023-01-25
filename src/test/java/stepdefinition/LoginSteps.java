package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factories.DriverFactory;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

public class LoginSteps {
	Loginpage login = new Loginpage(DriverFactory.getDriver());
	
	@Given("user is on LUMA app")
	public void user_is_on_luma_app() {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
	
	    DriverFactory.getDriver().get("www.google.com");
		
	}


	@Then("user is not logged in successfully")
	public void user_is_not_logged_in_successfully() {
	   
	}


}
