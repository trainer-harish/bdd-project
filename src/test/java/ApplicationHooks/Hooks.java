package ApplicationHooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.ConfigReader;
import factories.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
 DriverFactory driverFactory;
	 WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	
	  @Before(order = 0) public void getProperty() throws IOException {
	  configReader = new ConfigReader(); 
	  prop = configReader.initializeProperty();
	  }
	  
	  @Before(order = 1) public void launchBrowser() { 
		  String browserName = prop.getProperty("Browser"); 
		  driverFactory = new DriverFactory();
	  driver = driverFactory.init_driver("chrome"); 
	  //driver.manage().window().maximize();
	  }
	 
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	

}
