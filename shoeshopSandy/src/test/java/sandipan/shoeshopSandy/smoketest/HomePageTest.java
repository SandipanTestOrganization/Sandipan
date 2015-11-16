package sandipan.shoeshopSandy.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.pages.HomePage;

public class HomePageTest {
	
	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		HomePage.GoTo();
		Assert.assertTrue(HomePage.IsAt());
	}
	
	@Test
	public void Can_Go_To_HomePage(){
		Browser.Close();
	}

}
