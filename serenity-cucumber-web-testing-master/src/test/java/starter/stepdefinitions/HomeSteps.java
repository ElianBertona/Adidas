package starter.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class HomeSteps {
	@Steps
	HomePage home;
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	  home.openStore();
	}
	@When("user navigate to {string}")
	public void user_navigate_to_category(String category) throws InterruptedException {
		Thread.sleep(2000);
		home.navigateTo(category);
	} 
	@Then("user shuold be login as {string}")
	public void user_shuold_be_login(String username) {
		Assert.assertTrue(home.loginVerify(username));
	}
	
}
