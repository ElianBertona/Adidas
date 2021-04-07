package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import net.serenitybdd.core.pages.PageObject;

public class CartPageLocators extends PageObject {

	public void deleteProduct(String prodcut) {

		try {
			$(By.xpath("(//tr[@class='success']//a)[2]")).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void placeOrder() {
		try {
			$(By.xpath("//button[@class='btn btn-success']")).click();
		} catch (StaleElementReferenceException | ElementNotInteractableException e) {
			$(By.xpath("//button[@class='btn btn-success']")).click();
		}
	}
}
