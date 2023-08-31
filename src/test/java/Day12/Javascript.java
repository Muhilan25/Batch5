package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
//		js.executeScript("document.getElemenyById('password').setAttribute('value', 'secret_sauce')");
		
//		login.click();
		
		js.executeScript("arguments[0].click()", login);
		
//		Two types of scrolling
		
//		one type 
		
//		js.executeScript("window.scrollTo(0,1100)");
		
//		second type
		
		WebElement at = driver.findElement(By.xpath("//button[contains(@id , 'add-to-cart-test.allthethings()-t-shirt-(red)' )]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", at);

	}

}
