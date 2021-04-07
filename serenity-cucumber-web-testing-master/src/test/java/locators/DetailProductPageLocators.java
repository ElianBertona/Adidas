package locators;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class DetailProductPageLocators extends PageObject{

	public void addProduct() {
		 $(By.xpath("//a[contains(@class,'btn btn-success')]")).click();
	}

	public void goToHomePage() {
		 $(By.id("nava")).click();
	}
}
