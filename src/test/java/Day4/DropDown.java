package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement login = driver.findElement(By.cssSelector("input[data-test='login-button']"));
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
//		select class is used to handle drop down web element
		
		WebElement filter = driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));
		Select s = new Select(filter);
		List<WebElement> p = s.getOptions();
		for(WebElement w: p) {
			System.out.println(w.getText());
		}
//		selecting using index values
//		s.selectByIndex(2);
		
//		selecting by visible text
//		s.selectByVisibleText("Price (high to low)");
		
//		select by value 
//		s.selectByValue("hilo");

	}

}
