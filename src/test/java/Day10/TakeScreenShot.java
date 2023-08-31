package Day10;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
//		Take Screenshot Interface
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		
//		source
		
//		Destination
		
		File source = s.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\target\\2.png");
	   

		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	
		Thread.sleep(3000);
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
