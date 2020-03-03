package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddenelement {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\balaji\\Downloads\\geckodriver.exe");
	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	 //Implicit wait for 10 seconds
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //To launch softwaretestingmaterial.com
	 driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	/* JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebElement hiddenbutton=driver.findElement(By.xpath("//input"));
	 Thread.sleep(3000);
	 String script="arguments[0].click()";
	 js.executeScript(script, hiddenbutton);*/
	 WebElement male=driver.findElement(By.xpath("//*[@id='male']"));
	 male.getSize();
	 boolean check= male.isDisplayed();
	 boolean check1= male.isEnabled();
	 boolean check2= male.isSelected();
	 System.out.println(check);
	 System.out.println(check1);
	 System.out.println("Before Function Call "+ check2);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 WebElement hiddenbutton=driver.findElement(By.xpath("//input"));
	 Thread.sleep(3000);
	 String script="arguments[0].click()";
	 js.executeScript(script, hiddenbutton);
	 boolean check3= male.isSelected();
	 System.out.println("After Function Call "+ check3);
	}
}
