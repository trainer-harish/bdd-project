package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerCreationPage {
	WebDriver driver;

	//constructor
	public CustomerCreationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locator object repository
  private	By firstNameLocator = By.id("firstname");
  private By lastNameLocaror = By.xpath("//*[@id='lastname']");
  private By emailLocator = By.id("email_address");
  private By passwordLocator = By.id("password");
  private By cnfPassLocator = By.name("password_confirmation");
  private By submitLocator = By.className("action submit primary");
  
  //action methods
  
  public void enterFirstname(String firstname) {
	driver.findElement(firstNameLocator).sendKeys(firstname);
}
  public void enterLastname(String lastname) {
		driver.findElement(lastNameLocaror).sendKeys(lastname);
	}
  
  public void enteremail(String email) {
		driver.findElement(emailLocator).sendKeys(email);
	}
  public void enterpassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
  
  public void entercnfpassword(String password) {
		driver.findElement(cnfPassLocator).sendKeys(password);
	}
  
  public void clickSubmitButton() {
		driver.findElement(submitLocator).click();
	}
	
	

}
