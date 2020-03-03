package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionKeywords {
	public static WebDriver driver;
	 
	 public static void openBrowser(String object){ 
	 driver=new FirefoxDriver();
	 }
	 
	 public static void navigate(String object){ 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get(Constants.URL);
	 }
	 
	 public static void productnavigate(){
		 driver.get("http://shop.demoqa.com/product/black-lux-graphic-t-shirt/");
	 }
	 
	 public static void select_color(String object){
		 WebElement select=driver.findElement(By.xpath("//*[@id='pa_color']"));
			Select date=new Select(select);
			date.selectByVisibleText(Constants.Color);
	 }
	 
	 public static void select_size(){
		 WebElement select1=driver.findElement(By.xpath("//*[@id='pa_size']"));
			Select date1=new Select(select1);
			date1.selectByVisibleText(Constants.Size);
	 }
	 
	 public static void click_button(){
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
	 }
	 
	 public static void waitFor() throws Exception{
	 Thread.sleep(5000);
	 }
	 
	 public static void Cart_Count(){
		 driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div/div/ul/li/a/span/span[2]")).click();
	 }
	 
	 public static void New_Class(){
		 System.out.println("I am New Method for this class");
	 }
	 
	 public static void closeBrowser(){
	 driver.quit();
	 }
}
