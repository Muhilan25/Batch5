package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		To launch the website
		
		driver.get("https://www.saucedemo.com/");
		
//		To get Title
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
//		To get Current url
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		
//		To get Maximize the screen
		driver.manage().window().maximize();
		
//		To get Minimize the screen
		driver.manage().window().minimize();
		
//		To close
		driver.close();
		
	}

}
