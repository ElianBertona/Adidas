package pages;

import locators.AlertPageLocator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class AlertPage extends PageObject{

AlertPageLocator alertPageLocator;
	
	@Step
	public void acceptTransaction() {
		alertPageLocator.acceptTransaction();
	}
}
