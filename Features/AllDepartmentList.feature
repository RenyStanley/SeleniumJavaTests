Feature: Verify the dropdown list for All department in Search window.

Background:	
			Given I am on Amazon homepage
		
Scenario: Verify the dropdown list in All field next to serach box
	
			When I click on All dropdown button near search box
			Then I should see "Watches" in the dropdown list
  
Scenario: Verify all items in the dropdown list in All field next to serach box
	
			When I click on All dropdown button near search box
			Then I  the dropdown should contain all items
	  
		