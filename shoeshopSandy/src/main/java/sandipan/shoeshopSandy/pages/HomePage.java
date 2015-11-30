/**
 * 
 */
package sandipan.shoeshopSandy.pages;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.logger.SHOELogger;

/**
 * @author Sandipan
 *
 */
public class HomePage {

	public static String shoeShopHomePageURL = "http://182.72.246.194/prestashop_1.6.1.1/prestashop/";
	public static void GoTo() {
		SHOELogger.Log("Inside - HomePage : GoTo");
		Browser.getDriver().navigate().to(shoeShopHomePageURL);
	}
	public static boolean IsAt() {
		SHOELogger.Log("Inside - HomePage : IsAt");
		return true;
	}

}
