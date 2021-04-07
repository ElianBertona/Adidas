package pages;

import locators.LoginFormPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginFormPage extends PageObject {

	LoginFormPageLocators loginFormLocators;

	@Step
	public void enterUsername(String demoUser) {
		loginFormLocators.enterUsername(demoUser);
	}

	@Step
	public void enterPassord(String demoUser) {
		loginFormLocators.enterPassord(demoUser);
	}

	@Step
	public void clickOnLoginButton() {
		loginFormLocators.clickOnLoginButton();
	}

	@Step
	public void login(String demoUser) {
		loginFormLocators.enterUsername(demoUser);
		loginFormLocators.enterPassord(demoUser);
		loginFormLocators.clickOnLoginButton();
	}
}
