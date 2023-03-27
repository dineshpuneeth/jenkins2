package orangehrmtestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test001 {
	WebDriver driver;
@Test(groups="smoke")	
public void openapplication()
{
	System.out.println("application opened");
}
@Test(groups = {"sanity","smoke"})
public void login()
{
	System.out.println("login completed");
}
@Test(groups = {"sanity","it"})
public void logout()
{
	System.out.println("logout completed");
}
@Test(groups = "smoke")
public void closeapplication()
{
	System.out.println("application closed");
}

}
