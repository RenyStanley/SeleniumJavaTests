package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class HomePageStepDefinition extends WebConnector{
	
		//Locators
	
	private String searchBox= "//input[@id='twotabsearchtextbox']";
	private String searchButton = "//input[@value='Go']";
	private String searchResultHeading = "//span[@id='s-result-count']";
	
//Connect to homepage
	
	@Given("I am on Amazon homepage")
	public void i_am_on_Amazon_homepage() throws InterruptedException {
	   driver.get(baseUrl);
	   Thread.sleep(3000);
// Above needs to be optimised so that the wait for 3 secs does not happen if the site is loaded
//  wait = new WebDriverWait(driver, 2);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Today's Deals")));
	}
	   
// Verify the title 	   
	  @Then("I should see the {string} Title")
	   public void i_should_see_the_Title(String expTitle) {
	       Assert.assertEquals(expTitle, driver.getTitle());
	   }
	  
// Entering text in search field	  
	   @When("I type {string} in serach box")
	   public void i_type_in_serach_box(String typetText) {
		   driver.findElement(By.xpath(searchBox)).sendKeys(typetText);		   
	   }
	
// Triggering the search	   
	   @When("I click on search button")
	   public void i_click_on_search_button() throws InterruptedException {
		   driver.findElement(By.xpath(searchButton)).click();	
		   Thread.sleep(3000);   
	   }
	   
// Verifying search result is returned	   
	   @Then("I should see {string} in search results page")
	   public void i_should_see_in_search_results_page(String expText) {
		   String actText=driver.findElement(By.xpath(searchResultHeading)).getText();
		   Assert.assertTrue(actText.contains(expText));
	   }

}	   
