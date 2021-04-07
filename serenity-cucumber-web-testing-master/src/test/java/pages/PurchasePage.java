package pages;

import org.junit.Assert;
import locators.PurchaseLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PurchasePage extends PageObject {

	PurchaseLocators purchaseLocators;

	@Step
	public void veifyAmount(String amount) {
		purchaseLocators.captureId();
		Assert.assertEquals(amount, purchaseLocators.verifyAmount());
		purchaseLocators.acceptPurchase();
	}
}
