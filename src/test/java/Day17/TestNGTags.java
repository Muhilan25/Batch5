package Day17;

import org.testng.annotations.Test;

public class TestNGTags {

//	invocationCount
	
//	if we need to run a method for more than one time it is used
	
	@Test(invocationCount = 5 , invocationTimeOut = 1000)
	public void click() {
		System.out.println("click");
	}
	
}
