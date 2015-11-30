package sandipan.shoeshopSandy.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sandipan.shoeshopSandy.browser.Browser;

public class Utility {

	int maxSecond;
	public static WebElement waitForPageUntilElementIsVisible(By locator, int maxSecond){
		return (new WebDriverWait(Browser.getDriver(), maxSecond))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
