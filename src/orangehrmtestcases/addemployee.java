package orangehrmtestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class addemployee {
	WebDriver driver;
	
@BeforeSuite
public void startup()
{
System.setProperty("webdriver.gecko.driver", "D:\\FirefoxDrivers\\geckoDriver.exe");
driver=new FirefoxDriver();
}
@BeforeClass
public void launchapplication()
{
	driver.get("http://183.82.103.245/nareshit/login.php");
	Reporter.log("application opened");
}
@Test
public void login() throws InterruptedException
{
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Reporter.log("login completed");
	Thread.sleep(4000);
}
@Test
public void addemp() throws InterruptedException
{
	
	driver.switchTo().frame("rightMenu");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("txtEmpFirstName")).sendKeys("dinnnnnn");
	driver.findElement(By.id("txtEmpLastName")).sendKeys("bbbbbbbb");
	driver.findElement(By.id("btnEdit")).click();
	driver.switchTo().defaultContent();
}
@Test
public void logout()
{
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("logout completed");
}
@AfterSuite
public void closeapplication()
{
	driver.close();
	Reporter.log("application closed");
	
}
	
}
