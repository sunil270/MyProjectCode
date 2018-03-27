package GitTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGitPushPull {
	
	@BeforeTest
	public void beforeTest(){
		
		System.out.println("Before test case is executed");
		
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After test case is executed");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method is executed");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method is executed");
	}
	@Test(priority=3)
	public void doLogin(){
		System.out.println("Login Test Execution");
	}

	@Test(priority=2)
	public void doPasswordChange(){
		System.out.println("Password change successful");
	}
	
	@Test(priority=1)
	public void doLogout(){
		System.out.println("Logout successful");
	}

}


