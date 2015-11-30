/**
 * 
 */
package sandipan.shoeshopSandy.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import sandipan.shoeshopSandy.browser.Browser;
import sandipan.shoeshopSandy.navigation.MenuBar.SubMenu;
import sandipan.shoeshopSandy.utility.Utility;
import sandipan.shoeshopSandy.uimap.MenuSelectorLocators;

/**
 * @author Sandipan
 *
 */
public class MenuSelector {

static int maxSecond = 5000;
	
	
	public static void Select(MenuBar topMenuItem, SubMenu subMenuItem) {                      
		switch (topMenuItem) {
		case WOMEN:
			Actions womenAction = new Actions(Browser.getDriver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_xPath), maxSecond));
			womenAction.build().perform();
			switch (subMenuItem) {
			case NONE:
				womenAction.click().build().perform();
				break;
			case WOMEN_HEELS:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_heels_xPath), maxSecond)).click().build().perform();
				break;			
			case WOMEN_HEELS_HIGHHEELS:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_heels_highheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_HEELS_LOWHEELS:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_heels_lowheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_HEELS_POINTEDHEELS:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_heels_pointedheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_HEELS_WEDGEHEELS:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_heels_wedgeheels_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SANDALS:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_sandals_xPath), maxSecond)).click().build().perform();
				break;			
			case WOMEN_SANDALS_KITTEN:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_sandals_kitten_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SANDALS_REGULAR:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_sandals_regular_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_shoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_CASUALSHOE:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_shoes_casualshoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_ETHINICSHOES:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_shoes_ethinicshoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_FORMALSHOES:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_shoes_formalshoes_xPath), maxSecond)).click().build().perform();
				break;
			case WOMEN_SHOES_SPORTSHOES:
				womenAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.women_shoes_sportshoes_xPath), maxSecond)).click().build().perform();
				break;
			default:
				break;
			}
			break;
		case MEN:
			Actions menAction = new Actions(Browser.getDriver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_xPath), maxSecond));
			menAction.build().perform();
			switch (subMenuItem) {
			case NONE:
				menAction.click().build().perform();
				break;
			case MEN_SHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_shoes_xPath), maxSecond)).click().build().perform();
				break;			
			case MEN_SHOES_CASULASHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_shoes_causualshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_SHOES_FORMALSHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_shoes_formalshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_SHOES_SEMIFORMALS:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_shoes_semiformals_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_SNEAKERS:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_sneakers_xPath), maxSecond)).click().build().perform();
				break;	
			case MEN_SNEAKERS_REGULARS:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_sneakers_regulars_xPath), maxSecond)).click().build().perform();
				break;			
			case MEN_ATHELETICS:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_atheletics_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_INDOORSPORTSHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_atheletics_indoorsportshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_OUTDOORANDHIKINGSHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_atheletics_outdoorandhikingshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_RUNNINGSHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_atheletics_runningshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_ATHELETICS_TRANNINGSHOES:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_atheletics_tranningshoes_xPath), maxSecond)).click().build().perform();
				break;
			case MEN_LOAFERS:
				menAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.men_loafers_xPath), maxSecond)).click().build().perform();
				break;			
			default:
				break;
			}
			break;
		case KIDS:
			Actions kidsAction = new Actions(Browser.getDriver()).moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_xPath), maxSecond));
			kidsAction.build().perform();
			switch (subMenuItem) {
			case NONE:
				kidsAction.click().build().perform();
				break;
			case KIDS_BOYS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_BOOTS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_boots_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_CASUALSHOE:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_casualshoe_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_FLIPFLOPS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_flipflops_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_SANDELS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_sandels_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_SCHOOLSHOES:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_schoolshoes_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_BOYS_SPORTSHOES:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_boys_sportshoes_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_girls_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_CLOGS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_girls_clogs_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_FLATANDBELLIES:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_girls_flatandbellies_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_SANDELS:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_girls_sandels_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_GIRLS_SPORTSANDCASUALSHOES:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_girls_sportsandcasualshoes_xPath), maxSecond)).click().build().perform();
				break;
			case KIDS_KID:
				kidsAction.moveToElement(Utility.waitForPageUntilElementIsVisible(By.xpath(MenuSelectorLocators.kids_kid_xPath), maxSecond)).click().build().perform();
				break;
			default:
				break;			
			}	
			break;
		} 
	}
}
