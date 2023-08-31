package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends TestBase {
	
//  Webelements in a different way and easier way 

	@FindBy(xpath = "//input[contains(@placeholder , 'Username')]")
	WebElement username ; 
	
	@FindBy(xpath = "//input[contains(@data-test, 'password')]")
	WebElement password ;
	
	@FindBy(xpath = "//input[contains(@id , 'login-button')]")
	WebElement login ;
	
	// PageFactory class in constructor 
	
		public Login()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void loginaction()
		{
			username.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			login.click();
		}
		
		public void teardown()
		{
			driver.quit();
		}
		
}
