package orangehrmtestcases;

import java.util.List;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ultility.Log;

public class FlipkartExample {
	 public WebDriver driver;
@Parameters("browser")
@BeforeTest
public void launchbrowser(String browser)
{
	if (browser.toLowerCase().equals("firefox"))
	{
		driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\FirefoxDrivers\\geckoDriver.exe");	
	}
	else if (browser.toLowerCase().equals("edge"))
	{
		driver=new EdgeDriver();
		System.setProperty("webdriver.EdgeDriver.driver", "D:\\Edgedrivers\\geckoDriver.exe");	
	}
}
@Test
public void openfilipkart() throws InterruptedException
{
	//DOMConfigurator.configure("log4j.xml");
		 
		driver.get("https://www.flipkart.com/");
		Log.info("application opened successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		Thread.sleep(4000);
		Log.info("successfully clicked on mobile menu");
		driver.findElement(By.xpath("//p[@class='_1aqDWQ']/../../../../div/div/a/p")).click();
		Thread.sleep(3000);
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(price.size());
		for(WebElement ele:price)
		{
			System.out.println(ele.getText());
		}
		driver.close();
		Log.info("application closed successfully");
		
	}

}
