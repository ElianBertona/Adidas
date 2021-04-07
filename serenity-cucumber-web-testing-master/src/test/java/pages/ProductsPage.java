package pages;

import locators.ProductsPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ProductsPage extends PageObject {

	ProductsPageLocators ProductsLocators;

	@Step
	public void selectProduct(String product) {
		ProductsLocators.selectProduct(product);
	}
}
