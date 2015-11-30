package sandipan.shoeshopSandy.menu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.navigation.TopMenuBar;
import sandipan.shoeshopSandy.pages.HeelsPage;
import sandipan.shoeshopSandy.pages.HomePage;


public class WomenMenuTest {
	
	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void CleanUp(){
		
	}
	
	@Test
	public void Can_Show_All_Women_HeelsShoe(){
		//HomePage.GoTo_Women_Heels();
		HomePage.GoTo();
		TopMenuBar.Women.Heels.select();
		//TopMenuBar.Women.Heels.HighHeels.select();
		//Assert.assertTrue(HeelsPage.IsAt());
	}
	
	// Can show all HighHell
	//Can show all Low heels
	//Can show all Pointed heels
	//can show all Wedge Heels

}
