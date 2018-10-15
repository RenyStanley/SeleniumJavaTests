Feature: Verify the Links in Navigation Bar work correctly

Background: 
			Given I am on Amazon homepage
			
Scenario Outline: Verify all links, with link text, in Navigation Bar
 
		When I click on "<linkText>" link 
		Then I should be on "<pageurl>" page 		
Examples:
	| linkText | pageurl |
	|Your Amazon.co.uk|	https://www.amazon.co.uk/ap/signin?_encoding=UTF8&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fyourstore%2Fcard%3Fie%3DUTF8%26ref_%3Dcust_rec_intestitial_signin|
	|Today's Deals|	https://www.amazon.co.uk/gp/deals?ref=nav_cs_gb|
	|Gift Cards & Top Up|	https://www.amazon.co.uk/Giftcards-Giftvouchers-Vouchers-Birthday-Gifts/b/?ie=UTF8&node=1571304031&ref=nav_cs_gc|
	|Sell|	https://www.amazon.co.uk/b/?_encoding=UTF8&ld=AZUKGNOSellC&node=2374298031&ref=nav_cs_sell|
	|Help|	https://www.amazon.co.uk/gp/help/customer/display.html?nodeId=508510&ref=nav_cs_help|
	|Try Prime|https://www.amazon.co.uk/amazonprime?_encoding=UTF8&ref=nav_logo_prime_join|
	
@run
Scenario Outline: Verify all link buttons, without link text, in Navigation Bar
 
		When I click on "<linkButton>" button 
		Then I should be on "<pageurl>" page 
Examples:
	|linkButton|			pageurl|
	|Shop By Department|	https://www.amazon.co.uk/gp/site-directory?ref=nav_shopall_btn|
	|Hello Sign in Your Account|	https://www.amazon.co.uk/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0|
	|Try Prime|				https://www.amazon.co.uk/amazonprime?_encoding=UTF8&ref=nav_prime_try_btn|
	|Your List|  			https://www.amazon.co.uk/gp/registry/wishlist?ref=nav_wishlist_btn|	
	|Basket | https://www.amazon.co.uk/gp/cart/view.html?ref=nav_cart|
	|Amazon logo|https://www.amazon.co.uk/ref=nav_logo|