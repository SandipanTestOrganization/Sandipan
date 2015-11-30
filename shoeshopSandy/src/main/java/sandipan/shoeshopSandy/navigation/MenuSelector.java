package sandipan.shoeshopSandy.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.navigation.TopMenu.SubMenu;



public class MenuSelector {

	static int maxSecond = 5000;
	
	static String women_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a";
	static String woemn_heels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/a";
	
	public static WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.Driver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}


	/*public static void Select(String topLevelMenu, String subMenuLinkText) {
		Actions hoverOver = new Actions(Browser.Driver())
				.moveToElement(waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"), maxSecond));
		hoverOver.build().perform();
		
		hoverOver.moveToElement(waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/a"), maxSecond)).click().build().perform();
				
	}*/


	public static void Select(TopMenu topMenuItem, SubMenu subMenuItem) {
		// TODO Auto-generated method stub
		switch (topMenuItem) {
		case WOMEN:
			Actions hoverOver = new Actions(Browser.Driver())
					.moveToElement(waitForPageUntilElementIsVisible(By.xpath(women_xPath), maxSecond));
			hoverOver.build().perform();
			switch (subMenuItem) {
			case WOMEN_HEELS:
				hoverOver.moveToElement(waitForPageUntilElementIsVisible(By.xpath(woemn_heels_xPath), maxSecond)).click().build().perform();
				break;

			case WOMEN_SANDALS:
				
				break;
			
			case WOMEN_SHOES:
				
				break;
			}

		case MEN :
			break;
			
		case KIDS :
			break;
		}
	}


	


	

}
