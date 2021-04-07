package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.DetailProductPage;

public class DetailProductSteps {
	
	@Steps
	DetailProductPage detailProduct;

	@When("user add the product")
	public void user_add_the_product() {
		detailProduct.addProductToTheCar();
	}
}
