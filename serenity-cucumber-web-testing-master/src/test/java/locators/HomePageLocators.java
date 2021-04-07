package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

import net.serenitybdd.core.pages.PageObject;

public class HomePageLocators extends PageObject {

	public void openLoginForm() {
		$(By.id("login2")).click();
	}

	public boolean loginVerify(String demoUser) {
		return $(By.xpath("//*[contains(text(),'Welcome " + demoUser + "')]")).isDisplayed();
	}

	public void navigateToCategory(String category) {
		try {
			$(By.xpath("//a[contains(@class, 'list-group-item') and text() = '" + category + "']")).click();
		} catch (StaleElementReferenceException e) {
			$(By.xpath("//a[contains(@class, 'list-group-item') and text() = '" + category + "']")).click();
		}
	}

	public void openCart() {
			$(By.id("cartur")).click();
	}
}
