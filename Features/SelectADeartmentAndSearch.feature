Feature: Search for product in a choosen department

Background:

			Given I am on Amazon homepage

Scenario:
			When I click on All dropdown button near search box
			And  I Select "Books" from dropdown list
			And I type "Harry Potter" in serach box
			And I click on search button
			Then I should see "Books :" in search results page
			And I should see "Harry Potter" in search results page