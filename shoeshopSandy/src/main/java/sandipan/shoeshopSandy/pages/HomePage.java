package sandipan.shoeshopSandy.pages;

import sandipan.shoeshopSandy.browser.Browser;

public class HomePage {

	private static String homePageTitle = "ShoeFactory";
	public static void GoTo() {
		// TODO Auto-generated method stub
		Browser.Driver().navigate().to("http://182.72.246.194/prestashop_1.6.1.1/prestashop/");
	}

	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals(homePageTitle);
	}

}
