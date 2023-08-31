package Pom;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner extends TestBase{

	Login l;
	
	@BeforeTest
	public void bt() {
		intialize();
		geturl();
	}
	
	@Test
	public void main() {
		l = new Login();
		l.loginaction();
	}
	
	@AfterTest
	public void exit() {
		l.teardown();
	}
}

