package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
//		class
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless=new");
//		interface with overloading
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement login = driver.findElement(By.cssSelector("input[data-test='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String url = "https://www.saucedemo.com/inventory.html";
		String cururl = driver.getCurrentUrl();
		
		if (url.equals(cururl)) {
			System.out.println("login successfully");
		}else  {
			System.out.println("login failure");
		}
		
		
		
	
	
	}

}
