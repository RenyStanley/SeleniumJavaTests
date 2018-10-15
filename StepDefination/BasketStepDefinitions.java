package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class BasketStepDefinitions extends WebConnector{
	
	
	@Given("The basket is empty")
	public void the_basket_is_empty() {
	  String basketCount= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
	  String expCount ="0";
	  Assert.assertEquals(expCount, basketCount);
	}
	
	@When("I select the {int} item from search result")
	public void i_select_the_item_from_search_result(Integer searchItem) throws InterruptedException {
		Thread.sleep(2000);
// making the xpath interactive, so that xpath is generated based on user input
// breaking the xpath into 3 parts, of which one is the string value of user input
// then concatenate the strings to create the xpath
		String path1 = "//li[@id='result_";
		String path2 = String.valueOf(searchItem);
		String path3 = "']/div[@class='s-item-container']/div[@class='a-fixed-left-grid']/div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-left']/div[@class='a-row']/div[@class='a-column a-span12 a-text-center']/a[@class='a-link-normal a-text-normal']";		
		String path = path1 +path2+ path3;
		System.out.println(path);
		System.out.println("//li[@id='result_0']/div[@class='s-item-container']/div[@class='a-fixed-left-grid']/div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-left']/div[@class='a-row']/div[@class='a-column a-span12 a-text-center']/a[@class='a-link-normal a-text-normal']");
// driver.findElement(By.xpath("//li[@id='result_0']/div[@class='s-item-container']/div[@class='a-fixed-left-grid']/div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-left']/div[@class='a-row']/div[@class='a-column a-span12 a-text-center']/a[@class='a-link-normal a-text-normal']")).click();
		driver.findElement(By.xpath(path)).click();

	}
	
// adding n number of items to the basket and verify the basket count is correctly increased
	@When("Add {int} item to my basket")
	public void add_item_to_my_basket(Integer addQuantity) {
// find initial count
		String basketCount= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
		int basketCountInt = Integer.parseInt(basketCount);
// Editing quantity, if more than one quantity
		if (addQuantity>1){
			String quantity = String.valueOf(addQuantity);
			WebElement qtyDropDown = driver.findElement(By.xpath("//select[@class='a-native-dropdown']"));
			Select qtyDropDownItem = new Select (qtyDropDown);
			qtyDropDownItem.selectByVisibleText(quantity);
			
		}
// add to basket
	 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//find new basket count
	  String basketCountNew= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
	  System.out.println(basketCountNew);
//convert the string to integer
	  int basketCountNewInt = Integer.parseInt(basketCountNew);
// check the new count = old cound incremented by new quantity
	  Assert.assertTrue(basketCountNewInt == basketCountInt+addQuantity);
	 
	}
//	@When("Add the item to my basket")
//	public void add_the_item_to_my_basket() {
//		String basketCount= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
//		int basketCountInt = Integer.parseInt(basketCount);
//	 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//	  String basketCountNew= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
//	  System.out.println(basketCountNew);
//	  int basketCountNewInt = Integer.parseInt(basketCountNew);
//	 //String expCountNew ="1";
//	  //Assert.assertEquals(expCountNew, basketCountNew);
//	  Assert.assertTrue(basketCountNewInt == basketCountInt+1);
//	 
//	}
	
	@Then("The item count should be {int}")
	public void the_item_count_should_be(Integer expCount) {
		String basketCountNew= driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
		  System.out.println(basketCountNew);
		  int basketCountNewInt = Integer.parseInt(basketCountNew);
		 //String expCountNew ="1";
		  //Assert.assertEquals(expCountNew, basketCountNew);
		  Assert.assertTrue(basketCountNewInt == expCount);
	}
	
	
}

