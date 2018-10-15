package StepDefination;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;
import utilities.WebConnector;

public class NavBarStepDefinition extends WebConnector {


	private static String elementId;
// The element id has been dynamically set based on string provided
	@When("I click on {string} button")
	public void i_click_on_button(String linkButton) {
	if (linkButton.equals("Shop By Department")) {
		elementId="nav-link-shopall";
		
	}else if (linkButton.equals("Hello Sign in Your Account")) {
		elementId="nav-link-yourAccount";
	}else if (linkButton.equals("Try Prime")) {
		elementId="nav-link-prime";
	}else if (linkButton.equals("Your List")) {
		elementId="nav-link-wishlist";
	}else if (linkButton.equals("Basket")) {
		elementId="nav-cart";
	}else if (linkButton.equals("Amazon logo")) {
		elementId="nav-logo";
	}
	 driver.findElement(By.id(elementId)).click();
	}
}
