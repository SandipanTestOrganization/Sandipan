package sandipan.shoeshopSandy.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.logger.SHOELogger;
import sandipan.shoeshopSandy.pages.Pages;

public class HomePageTest {
	
	@Before
	public void Init(){
		SHOELogger.Configure();
		SHOELogger.Log("Browser Opening");
		Browser.Open();
	}

	@After
	public void Cleanup(){
		Browser.Close();
		SHOELogger.Log("Browser Closing");
	}
	
	@Test
	public void Can_Go_To_HomePage_Test(){
		SHOELogger.Log("Can_Go_To_HomePage_Test started");
		Pages.HomePage().GoTo();
		Assert.assertTrue(Pages.HomePage().IsAtHomePage());
		SHOELogger.Log("Can_Go_To_HomePage_Test completed");
	}
}
