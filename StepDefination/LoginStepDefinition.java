package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;



public class LoginStepDefinition extends WebConnector {

//locators	
private String signinEmailBox = "//input[@id='ap_email']";
private String continueButton = "//input[@id='continue']";
private String emailError="//span[@class='a-list-item']";
private String signinPasswordBox = "//input[@id='ap_password']";
private String signInButton = "//input[@id='signInSubmit']";

// enter email address in sign-in email box
	@When("I type {string} in sign-in email box")
	public void i_type_in_sign_in_email_box(String emailAdress) {
	    driver.findElement(By.xpath(signinEmailBox)).sendKeys(emailAdress);
	}
	
//click on continue	
	@When("I click on continue button")
	public void i_click_on_continue_button() {
	    driver.findElement(By.xpath(continueButton)).click();
	
	}
//Check the error reported when email is incorrect
	@Then("I should see an error  {string}")
	public void i_should_see_an_error(String expError) {
		String actText=driver.findElement(By.xpath(emailError)).getText();
		   Assert.assertTrue(actText.contains(expError));   
	}	
//enter the password
	@When("I type {string} in password box")
	public void i_type_in_password_box(String password) {
		driver.findElement(By.xpath(signinPasswordBox)).sendKeys(password);
	}
//click on sign in
	@When("I click on sign-in button")
	public void i_click_on_sign_in_button() {
		driver.findElement(By.xpath(signInButton)).click();
	}
}
