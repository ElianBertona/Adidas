package pages;

import locators.PlaceOrderLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class PlaceOrderFormPage extends PageObject {

	PlaceOrderLocators placeOrderLocators;

	@Step
	public void fillAllFields(String name, String country, String city, String card, String month, String year) {
		placeOrderLocators.fillFields(name,country,city,card,month,year);
	}
	@Step
	public void purchase() {
		placeOrderLocators.purchase();		
	}
}
