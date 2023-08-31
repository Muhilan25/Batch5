package Day16;

import org.testng.annotations.Test;

public class TestNGTAGS {

	@Test
	public void loginTC() {
		System.out.println("login");
		throw new RuntimeException();  // this is used to put error manually
	}
	
	@Test(dependsOnMethods = "loginTC")
	public void homeTC() {
		System.out.println("Home testcase");
	}
	
	@Test(dependsOnMethods = "loginTC")
	public void checkout() {
		System.out.println("checking out");
	}
	
	@Test(dependsOnMethods = "loginTC")
	public void logout() {
		System.out.println("logout test");
	}
}
