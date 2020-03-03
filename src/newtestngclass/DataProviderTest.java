package newtestngclass;

import java.util.concurrent.TimeUnit;

import newutilpackage.Xls_Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	public static WebDriver driver;
	@BeforeTest
	public static void Setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\balaji\\Downloads\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		
	}
	
	@DataProvider(name="Testdata")
	public void goal()
	{
		
	}
	
	@Test
	public static void data(String firstname,String lastname,String emailid,String password)
	{
		//Driver Initilization
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com/reg/PartialReg");
		
		//First Name Element Value
		WebElement FN=driver.findElement(By.id("firstname"));
		FN.clear();
		FN.sendKeys(firstname);
		//Last Name Element Value
		WebElement LN=driver.findElement(By.id("lastname"));
		LN.clear();
		LN.sendKeys(lastname);
		//Email ID Element Value
		WebElement EMAIL=driver.findElement(By.id("email"));
		EMAIL.clear();
		EMAIL.sendKeys(emailid);
		//Password Element Value
		WebElement PASS=driver.findElement(By.id("PASSWORD"));
		PASS.clear();
		PASS.sendKeys(password);
	}
	
	@AfterTest
	public static void TearUp(){
		driver.quit();
	}
	
}

