package StepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;


			

public class DropDownStepDefinition extends WebConnector {


	// Create an array with expected values in dropdown list
	
	String listItemsExpected[] = new String[45];
		
			
	@When("I click on All dropdown button near search box")
	public void i_click_on_All_dropdown_button_near_search_box() {

//Find the drop down Web Element
	
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
	}
	
// Verify a given value exists in the drop down
	@Then("I should see {string} in the dropdown list")
	
	public void i_should_see_in_the_dropdown_list(String actList) {
	
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));	
//Capture the values in dropdown as a list
	List<WebElement> alloptions = dropdown.findElements(By.tagName("option")); 	

// Loop to go through all the items in drop down list and see if it matches the item required
	
			int i=0;
			boolean itemFound= false;
			do {	
				String listItem = alloptions.get(i).getText();
				
				if (listItem.equals(actList)) {
				
				itemFound= true; 
//if the item has been found then no further search is required and set the counter to end of the loop
				
				i= alloptions.size();
				} 
// if the match has not been found then increase the counter to continue the search
				else {
					
					i=i+1;
				}
			}
			while (i<alloptions.size());
// itemFound is set to true if match  is found, else remains false  and test fails.	
			Assert.assertTrue(itemFound);		
	}
	
// Selecting an item using Select 
		@Then("I Select {string} from dropdown list")
		public void i_Select_from_dropdown_list(String selectDropdown) {
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			
			Select dropDownItem = new Select (dropdown);
			dropDownItem.selectByVisibleText(selectDropdown);
			
		}

// Verifying the dropdown includes all the itema nd in the correct order
		@Then("I  the dropdown should contain all items")
		public void i_the_dropdown_should_contain_all_items() {

			listItemsExpected[0]="All Departments";
			listItemsExpected[1]="Alexa Skills";
			listItemsExpected[2]="Amazon Devices";
			listItemsExpected[3]="Amazon Global Store";
			listItemsExpected[4]="Amazon Pantry";
			listItemsExpected[5]="Amazon Warehouse Deals";
			listItemsExpected[6]="Apps & Games";
			listItemsExpected[7]="Baby";
			listItemsExpected[8]="Beauty";
			listItemsExpected[9]="Books";
			listItemsExpected[10]="Car & Motorbike";
			listItemsExpected[11]="CDs & Vinyl";
			listItemsExpected[12]="Classical Music";
			listItemsExpected[13]="Clothing";
			listItemsExpected[14]="Computers & Accessories";
			listItemsExpected[15]="Digital Music ";
			listItemsExpected[16]="DIY & Tools";
			listItemsExpected[17]="DVD & Blu-ray";
			listItemsExpected[18]="Electronics & Photo";
			listItemsExpected[19]="Fashion";
			listItemsExpected[20]="Garden & Outdoors";
			listItemsExpected[21]="Gift Cards";
			listItemsExpected[22]="Grocery";
			listItemsExpected[23]="Handmade";
			listItemsExpected[24]="Health & Personal Care";
			listItemsExpected[25]="Home & Business Services";
			listItemsExpected[26]="Home & Kitchen";
			listItemsExpected[27]="Industrial & Scientific";
			listItemsExpected[28]="Jewellery";
			listItemsExpected[29]="Kindle Store";
			listItemsExpected[30]="Large Appliances";
			listItemsExpected[31]="Lighting";
			listItemsExpected[32]="Luggage";
			listItemsExpected[33]="Luxury Beauty";
			listItemsExpected[34]="Musical Instruments & DJ";
			listItemsExpected[35]="PC & Video Games";
			listItemsExpected[36]="Pet Supplies";
			listItemsExpected[37]="Prime Video";
			listItemsExpected[38]="Shoes & Bags";
			listItemsExpected[39]="Software";
			listItemsExpected[40]="Sports & Outdoors";
			listItemsExpected[41]="Stationery & Office Supplies";
			listItemsExpected[42]="Toys & Games";
			listItemsExpected[43]="VHS";
			listItemsExpected[44]="Watches";
			
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			
			List<WebElement> alloptions = dropdown.findElements(By.tagName("option"));
			
				for (int i=0; i<45; i=i+1) {
					String listItem = alloptions.get(i).getText();
					System.out.println("listItem = "+listItem+" Lits item expected = "+ listItemsExpected[i]);
					Assert.assertTrue(listItemsExpected[i].equals(listItem));
			
					}
		}

}
//	
//// Select an item in the drop down list 
//	
//	@Then("I Select {string} from dropdown list")
//	public void i_Select_from_dropdown_list(String selectDropdown) {
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//		
//		List<WebElement> alloptions = dropdown.findElements(By.tagName("option"));
//
// Loop to go through all the items in drop down list and see if it matches the item required
//		
//		int i=0; 
//		do {	
//			String listItem = alloptions.get(i).getText();
//			
//			if (listItem.equals(selectDropdown)) {
//			
//			alloptions.get(i).click();
////if the item has been found then no further search is required and set the index to end of the loop
//			
//			i= alloptions.size();
//			} 
//// if the match has not been found then increase the index to continue the search
//			else {
//				
//				i=i+1;
//			}
//		}
//		while (i<alloptions.size());
//			
//	}



