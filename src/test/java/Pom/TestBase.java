package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver  driver;

	public static void intialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void geturl() {
		driver.get("https://www.saucedemo.com/");
	}
}
