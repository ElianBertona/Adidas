package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.ElementNotInteractableException;
import net.serenitybdd.core.pages.PageObject;

public class PlaceOrderLocators extends PageObject {

	public void fillFields(String name, String country, String city, String card, String month, String year) {
		boolean error = false;
		do {
			try {
				$(By.id("name")).type(name);
				error = true;
			} catch (StaleElementReferenceException | ElementNotInteractableException e) {
			}
		} while (!error);

		$(By.id("country")).type(country);
		$(By.id("city")).type(city);
		$(By.id("card")).type(card);
		$(By.id("month")).type(month);
		$(By.id("year")).type(year);
	}

	public void purchase() {
		boolean exception = true;
		do {
			try {
				$(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();

				exception = false;
			} catch (StaleElementReferenceException | ElementNotInteractableException e) {
			}
		} while (exception);
		$(By.xpath("(//button[@class='btn btn-secondary']/following-sibling::button)[3]")).click();
	}
}
