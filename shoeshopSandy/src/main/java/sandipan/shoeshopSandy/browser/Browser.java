package sandipan.shoeshopSandy.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver webDriver;
	public static void Open() {
		webDriver = new FirefoxDriver();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		
	}
	public static void Close() {
		webDriver.quit();
	}
	public static WebDriver Driver() {
		return webDriver;
		
	}
	
	

}
