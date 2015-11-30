package sandipan.shoeshopSandy.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.pages.HomePage;

public class HomePageTest {
	
	@Before
	public void Init()
	{
		Browser.Open();
	}
	
	@Test
	public void Can_Go_To_Home_Page_Test()
	{
		HomePage.GoTo();
		Assert.assertTrue(HomePage.IsAt());
	}

	@After
	public void CleanUp()
	{
		Browser.Close();
	}
}
