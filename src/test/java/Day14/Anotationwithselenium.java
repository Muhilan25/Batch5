package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotationwithselenium {
	
	WebDriver driver;

	@BeforeTest
	public void initilizebrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void logintest() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.xpath("//input[contains(@placeholder , 'Username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@data-test, 'password')]"));
		WebElement login = driver.findElement(By.xpath("//input[contains(@id , 'login-button')]"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
