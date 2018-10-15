Feature:	Verify Homepage feature
# for comments
#background, run for each scenario in feature files
#It has to be first few consecutive steps in each scenario

Background: 
		Given I am on Amazon homepage
	
Scenario: Verify homepage Title
		Then 	I should see the "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more" Title
		
		
Scenario: Verify searching for T-shirts
		When I type "T-shirts" in serach box
		And I click on search button
		Then I should see "T-shirts" in search results page
		