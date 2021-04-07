package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.AlertPage;
import pages.DetailProductPage;
import pages.HomePage;
import pages.ProductsPage;

public class ProductsSteps {
	
	@Steps
	ProductsPage products;
	@Steps
	DetailProductPage detailProduct;
	@Steps
	AlertPage confirmationAlert;
	HomePage home;
	@When("user select the product {string}")
	public void user_select_the_product(String product) {
		products.selectProduct(product);
	} 
	@When("user add the {string} to the cart")
	public void user_add_the_product_to_the_cart(String product) {
		products.selectProduct(product);
		detailProduct.addProductToTheCar();
		confirmationAlert.acceptTransaction();
		detailProduct.goToHomePage();
	}
}
