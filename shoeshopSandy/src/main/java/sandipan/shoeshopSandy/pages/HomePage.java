/**
 * 
 */
package sandipan.shoeshopSandy.pages;

import sandipan.shoeshopSandy.browser.Browser;

/**
 * @author Sandipan
 *
 */
public class HomePage {

	public static String shoeShopHomePageURL = "http://182.72.246.194/prestashop_1.6.1.1/prestashop/";
	public static void GoTo() {
		Browser.getDriver().navigate().to(shoeShopHomePageURL);
		
	}
	public static boolean IsAt() {
		// TODO Auto-generated method stub
		return false;
	}

}
