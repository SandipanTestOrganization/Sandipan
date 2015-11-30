package sandipan.shoeshopSandy.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.logger.SHOELogger;
import sandipan.shoeshopSandy.pages.HomePage;

public class HomePageTest {
	
	@Before
	public void Init()
	{
		SHOELogger.Configure();
		SHOELogger.Log("HomePageTest - Sarting");
		SHOELogger.Log("Opening Browser");
		Browser.Open();
	}
	
	@Test
	public void Can_Go_To_Home_Page_Test()
	{
		SHOELogger.Log("Can_Go_To_Home_Page_Test - Strated");
		HomePage.GoTo();
		Assert.assertTrue(HomePage.IsAt());
		SHOELogger.Log("Can_Go_To_Home_Page_Test - Done");
	}

	@After
	public void CleanUp()
	{
		SHOELogger.Log("Closing Browser");
		//Browser.Close();
		SHOELogger.Log("HomePageTest - Ending");
	}
}
