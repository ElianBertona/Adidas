package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginFormPage;

public class LoginFormSteps {

	@Steps
	HomePage home;
	@Steps
	LoginFormPage loginForm;

	@When("user enter {string} as username")
	public void user_enter_demo_user_as_username(String username) {
		home.openLoginForm();
		loginForm.enterUsername(username);
	}

	@When("user enter {string} as password")
	public void user_enter_demo_user_as_password(String username) {
		loginForm.enterPassord(username);
	}

	@When("user press login")
	public void user_press_login() {
		loginForm.clickOnLoginButton();
	}

	@When("user is login on the store as {string}")
	public void user_is_login_on_the_store(String username) {
		home.openLoginForm();
		loginForm.login(username);
	}
}
