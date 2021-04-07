package pages;

import locators.HomePageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePage extends PageObject{
	
	HomePageLocators StoreHomePageLocator;
	
	@Step
	public void openStore() {
		StoreHomePageLocator.open();
	}
	@Step
	public void openLoginForm() {
		StoreHomePageLocator.openLoginForm();
	}
	@Step
	public boolean loginVerify(String username) {
		return StoreHomePageLocator.loginVerify(username);
	}
	@Step
	public void navigateTo(String category) {
		 StoreHomePageLocator.navigateToCategory(category);;
	}
	@Step
	public void openCart() {
		 StoreHomePageLocator.openCart();
	}
	
}