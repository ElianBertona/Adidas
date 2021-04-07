package locators;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import net.serenitybdd.core.pages.PageObject;

public class AlertPageLocator extends PageObject {

	public void acceptTransaction() {
		try {
			Thread.sleep(1000);
			getAlert().accept();
		} catch (NoAlertPresentException | InterruptedException | StaleElementReferenceException e) {
			getAlert().accept();
		}
	}
}
