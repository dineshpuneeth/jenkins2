package orangehrmtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupExecution {
		WebDriver driver;
		
	@Test(groups = "smoke")
	public void startup()
	{
	System.setProperty("webdriver.gecko.driver", "D:\\FirefoxDrivers\\geckoDriver.exe");
	driver=new FirefoxDriver();
	}
	@Test(groups= "smoke")
	public void launchapplication()
	{
		driver.get("http://183.82.103.245/nareshit/login.php");
		Reporter.log("application opened");
	}
	@Test(groups = "smoke")
	public void login()
	{
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("login completed");
	}

	@Test(groups = "sanity")
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("logout completed");
	}
	@Test
	public void closeapplication()
	{
		driver.close();
		Reporter.log("application closed");
		
	}
		

	}


