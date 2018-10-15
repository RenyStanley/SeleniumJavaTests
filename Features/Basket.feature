Feature: The verify goods are added to shopping basket correctly

Background:

			Given I am on Amazon homepage
			And The basket is empty

Scenario: Add one item, the first search returned, to the basket
			And I type "T-shirts" in serach box
			And I click on search button			
# Enter the item number from the list to be selected, where first search result is referenced as 0
			When I select the 0 item from search result
			And Add 1 item to my basket
 			Then The item count should be 1
#			And The item in basket should match item added
#       	And the Subtotal should match the price of item

Scenario: 	Add five same items, the first search returned, to the basket
			And I type "Toys" in serach box
			And I click on search button
# Enter the item number from the list to be selected, where first search result is referenced as 0
			When I select the 0 item from search result
			And Add 5 item to my basket
 			Then The item count should be 5
		
Scenario: Add two different item, the first search returned, to the basket
			And I type "T-shirts" in serach box
			And I click on search button
			When I select the 1 item from search result
			And Add 1 item to my basket
 			Then The item count should be 1
 			Then I click on "Amazon logo" button 
 			Then I type "Toys" in serach box
			Then I click on search button
			When I select the 1 item from search result
			And Add 1 item to my basket
 			Then The item count should be 2

#Scenario: Add the first n search returned item to the basket

