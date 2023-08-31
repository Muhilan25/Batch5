package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsLearning {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Muhil\\eclipse-workspace\\GroupTraining\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
//		Creating object for actions class
		
		Actions a = new Actions(driver); 
//		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
		a.contextClick(rightclick).build().perform();
		
		List<WebElement> opt = driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list context-menu-root')]/li"));
		
		for(WebElement q : opt) {
			System.out.println(q.getText());
			
			if(q.getText().equals("Paste")) {
				q.click();
				break;
			}
		}
		driver.switchTo().alert().accept();
		

		
	}
}
