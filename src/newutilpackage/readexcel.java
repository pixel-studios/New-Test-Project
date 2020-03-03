package newutilpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readexcel {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\balaji\\Downloads\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		Xls_Reader reader=new Xls_Reader("D://Ashwin//workspace//NewTestNg//src//newutilpackage//Testdata.xlsx");
		int rowcount=reader.getRowCount("HalfEbay");
		for(int i=2;i<=rowcount;i++){
			System.out.println("---------------------------------------------------------");
			String firstname=reader.getCellData("HalfEbay", "FirstName", i);
			System.out.println(firstname);
			String lastname=reader.getCellData("HalfEbay", "LastName", i);
			System.out.println(lastname);
			String emailid=reader.getCellData("HalfEbay", "Email", i);
			System.out.println(emailid);
			String password=reader.getCellData("HalfEbay", "Password", i);
			System.out.println(password);
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
			driver.quit();
		}
	}

}
