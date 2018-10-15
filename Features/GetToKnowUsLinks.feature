Feature: Verify links under Get to know us 

Background: 
			Given I am on Amazon homepage 
	
Scenario Outline: Verify all links in Get to know us 
			When I click on "<linkText>" link 
			Then I should be on "<pageurl>" page 
Examples: 

| linkText | pageurl |
| Careers | https://www.amazon.jobs/en-gb |
|About Us | https://www.aboutamazon.co.uk/?utm_source=gateway&utm_medium=footer|
|UK Modern Slavery Statement| https://www.amazon.co.uk/gp/help/customer/display.html/ref=help_search_1?ie=UTF8&nodeId=202151760|