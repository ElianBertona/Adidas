package pages;

import locators.CartPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class CartPage extends PageObject {

	CartPageLocators cartPageLocators;

	@Step
	public void deleteProduct(String product) {
		cartPageLocators.deleteProduct(product);
	}
	@Step
	public void placeOrder() {
		cartPageLocators.placeOrder();
	}
}
