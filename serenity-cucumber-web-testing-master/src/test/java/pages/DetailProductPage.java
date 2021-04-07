package pages;

import locators.DetailProductPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class DetailProductPage extends PageObject {

	DetailProductPageLocators detailProduct;
	@Step
	public void addProductToTheCar() {
		detailProduct.addProduct();
	}
	@Step
	public void goToHomePage() {
		detailProduct.goToHomePage();
	}
}
