package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class day1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.diver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");

	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/login");
		
		driver.manage().window().maximize();
		
		String em = "muhilanrangaraj33@gmail.com";
		
		String pas = "muhil25";
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'userLoginId')]"));
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@data-uia,'login-submit-button')]"));
		
		email.sendKeys(em);
		
		password.sendKeys(pas);
		
		login.click();
		

	}

}
