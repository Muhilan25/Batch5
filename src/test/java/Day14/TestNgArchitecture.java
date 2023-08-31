package Day14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgArchitecture {

//	Tags/Annotations
	
//	@TEST - Execution place [3rd place]
	
//	Before Test - will execute before all your tags [1st place]
	
//	Before Method - it will execute before @TEST [2nd place]
	
//	After Method - it will execute after @test [4th place]
	
//	After TEst - it is last part in our executions [5th place]
	
	@BeforeMethod
	public void deletecookies() {
		System.out.println("2 Cookies deleted");
	}
	
	@BeforeTest
	public void  launchbrowser() {
		System.out.println("1 Browser launched");
	}
	
	@Test
	public void tc01() {
		System.out.println("3 validation of login page");
	}
	
	@AfterMethod
	public void generatedreport() {
		System.out.println("4 Report generated");
	}
	
	@AfterTest 
	public void close() {
		System.out.println("5 Browser closed");
	}
	
	
}
