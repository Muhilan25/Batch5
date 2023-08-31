package Day9;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		TakesScreenshot s = (TakesScreenshot)driver;
		
		File source  = s.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\target\\table.png");
		
		
		
		WebElement table = driver.findElement(By.xpath("//table[contains(@id , 'customers')]"));
	
		List<WebElement> coloumn =  driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th"));
	
		List<WebElement> th = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th"));
		
		List<WebElement> rowdats = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td"));
	
		for(WebElement e : th)
		{
			System.out.println(e.getText());
		}
		
		System.out.println("********************************");
		
		for(WebElement w : rowdats)
		{
			System.out.println(w.getText());
		}
		
		for(int i = 1 ; i <= coloumn.size() ; i++)
		{
			List<WebElement> coloumnvalues = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/th["+i+"]"));
			
			for(WebElement e : coloumnvalues)
			{
				List<WebElement> rowvalues = driver.findElements(By.xpath("//table[contains(@id , 'customers')]/tbody/tr/td["+i+"]"));
				for(WebElement w :rowvalues )
				{
					System.out.println(e.getText());
					System.out.println(w.getText());
					System.out.println("*************************");
				}
			}}
		
		Thread.sleep(2000);
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
