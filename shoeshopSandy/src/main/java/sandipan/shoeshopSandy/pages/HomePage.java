package sandipan.shoeshopSandy.pages;
import sandipan.shoeshopSandy.browser.Browser;

public class HomePage {

	public String homeUrl = "http://182.72.246.194/prestashop_1.6.1.1/prestashop/";
	public String homePageTitle = "ShoeFactory";
	
	public void GoTo() {
		Browser.Driver().navigate().to(homeUrl);
		
	}

	public boolean IsAtHomePage() {
		// TODO Auto-generated method stub
		return Browser.Driver().getTitle().equals(homePageTitle);
	}

}
