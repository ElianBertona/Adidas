package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.PlaceOrderFormPage;

public class PlaceOrderSteps {
	@Steps
	PlaceOrderFormPage placeOrder;

	@When("user fill all the payment fields {string} {string} {string} {string} {string} {string}")
	public void user_fill_all_the_payment_fields(String name, String country, String city, String creditCard,
			String month, String year) {
		placeOrder.fillAllFields(name, country, city, creditCard, month, year);
		placeOrder.purchase();
	}
}
