package locators;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class PurchaseLocators extends PageObject {

	public void acceptPurchase() {
		$(By.xpath("//button[contains(@class,'confirm btn')]")).click();
	}

	public void captureId() {
		String id = $(By.xpath("//p[@class='lead text-muted ']")).getText().substring(4, 10).trim();
		System.out.print("This is the id: { " + id + " } ");
	}

	public String verifyAmount() {
		String amount = $(By.xpath("//p[@class='lead text-muted ']")).getText().substring(20, 24)
				.replaceFirst("USD", "").trim();
		System.out.print("This is the amount: { " + amount + " }");
		return amount;
	}
}
