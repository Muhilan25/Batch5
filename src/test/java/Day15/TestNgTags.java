package Day15;

import org.testng.annotations.Test;

public class TestNgTags {
	@Test(priority = 1)
	public void firstTC01()
	{
		System.out.println("First Test Case has been executed");
	}
	
	@Test(priority = 2)
	public void secondTC01()
	{
		System.out.println("Second Test Case has been executed");
	}
	
	@Test(priority = 3)
	public void thirdTC01()
	{
		System.out.println("third Test Case has been executed");
	}
	
	@Test(priority = 4)
	public void fourthTC01()
	{
		System.out.println("Four Test Case has been executed");
	}
	

	
//	is testNg is running in order way?
	
	
//	no
//	its is running in thread 
//	Everything will be executed in single way
//	we can set priority to run in ordered way
}
