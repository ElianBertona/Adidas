package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.CartPage;
import pages.DetailProductPage;
import pages.HomePage;

public class CartSteps {
	@Steps
	HomePage home;
	@Steps
	CartPage cart;
	@Steps
	DetailProductPage detailProduct;

	@When("user delete {string} from the cart")
	public void user_delete_the_product_to_the_cart(String product) {
		home.openCart();
		cart.deleteProduct(product);
		detailProduct.goToHomePage();
	}

	@When("user place the order")
	public void user_place_the_order() throws InterruptedException {
		home.openCart();
		cart.placeOrder();
	}
}
