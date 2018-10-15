package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utilities.WebConnector;

public class FooterLinksStepDefinitions extends WebConnector{

//Clicking on a Link
	@When("I click on {string} link")
	public void i_click_on_link(String linkText) throws InterruptedException {
	    driver.findElement(By.linkText(linkText)).click();
	    Thread.sleep(3000);
	}

// Verifying the link has worked	
	@Then("I should be on {string} page")
	public void i_should_be_on_page(String expPageUrl) {
	   Assert.assertEquals(expPageUrl, driver.getCurrentUrl());
	}
}
