package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import net.serenitybdd.core.pages.PageObject;

public class ProductsPageLocators extends PageObject{

	public void selectProduct(String product) {
		try {
		     $(By.xpath("//a[contains(text(),'"+product+"')]")).click();
		} catch (StaleElementReferenceException e) {
			 $(By.xpath("//a[contains(text(),'"+product+"')]")).click();
		 }
	}
}
