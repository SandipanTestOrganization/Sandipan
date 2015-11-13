package sandipan.shoeshopSandy.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver webDriver;
	

	public static void Open() {
		webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		
	}

	public static WebDriver Driver(){
		return webDriver;
	}
	public static void Close() {
		webDriver.quit();
	}

}
