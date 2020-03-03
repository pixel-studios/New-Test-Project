package newutilpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TC_Class1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\balaji\\Downloads\\geckodriver.exe");
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
	
	WebDriver driver = new FirefoxDriver(); 
	WebDriverWait wait=new WebDriverWait(driver, 20);
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	WebElement guru99seleniumlink;
	guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	guru99seleniumlink.click();
	}
}
