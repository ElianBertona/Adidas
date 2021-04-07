package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.PurchasePage;

public class PurchaseSteps {
	@Steps
	PurchasePage purchase;

	@Then("user should see the {string} in the confirmation popup")
	public void user_should_see_the_amount_in_the_confirmation_popup(String amount) {
		purchase.veifyAmount(amount);
	}
}
