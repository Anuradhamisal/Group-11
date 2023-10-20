package maven1package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClassMaven {
 
	
	@BeforeClass
	public void beforeClass  () {
		
		System.out.println("Before Class");
		}
	@BeforeMethod 
	public void beforeMethod () {
	System.out.println("Before Method");
	}
	
	@Test (priority = 1)
	public void test1 () {
	System.out.println("Test1");
	}
	
	@Test(priority = -121)
	public void test2 () {
	System.out.println("Test2");
	}
	
	@Test(priority = 30)
	public void test3 () {
	System.out.println("Test3");
	}
	
	@AfterMethod 
	public void afterMethod () {
	System.out.println("After Method");
	}
	
	@AfterClass 
	public void  afterClass () {
		System.out.println("After Class");
	}
}
