package config;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMethod {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\balaji\\Downloads\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
			System.out.println("HIII");
	}

}
