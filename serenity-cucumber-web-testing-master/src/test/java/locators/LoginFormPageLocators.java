package locators;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class LoginFormPageLocators extends PageObject {

	public void enterUsername(String demoUser) {
		$(By.id("loginusername")).typeAndEnter(demoUser);
	}

	public void enterPassord(String demoUser) {
		$(By.id("loginpassword")).typeAndEnter(demoUser);
	}

	public void clickOnLoginButton() {
		$(By.xpath("//button[text()='Log in']")).click();
	}
}
