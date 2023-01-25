package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factories.DriverFactory;

public class Loginpage {
	WebDriver driver;
	
	//constructor
		public Loginpage(WebDriver driver) {
			this.driver = driver;
		}
		
	
	//locator object repository
	private By userNameLocator = By.id("email");
	private  By passwordLocator = By.id("pass");

	
	
	// actions
	public void enteruser(String username) {
		driver.findElement(userNameLocator).sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
		
	}
	public void enterusernameAndPassword(String username, String password) {
		driver.findElement(userNameLocator).sendKeys(username);
		driver.findElement(passwordLocator).sendKeys(password);
		
	}
	

}
