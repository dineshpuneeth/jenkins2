package orangehrmtestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test002 {
	WebDriver driver;
	@Test(groups="smoke")	
	public void test1()
	{
		System.out.println("application opened");
	}
	@Test(groups = "smoke")
	public void test2()
	{
		System.out.println("login completed");
	}
	@Test(groups = "smoke")
	public void test3()
	{
		System.out.println("logout completed");
	}
	@Test(groups = "smoke")
	public void test4()
	{
		System.out.println("application closed");
	}


}
