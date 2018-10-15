Feature: Verify the login facility to  my amazon account

Background:
			Given I am on Amazon homepage
			And I click on "Hello Sign in Your Account" button
			And I should be on "https://www.amazon.co.uk/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&openid.pape.max_auth_age=0" page 

Scenario: Verify user cannot login using incorrect email 
			When I type "incorrectid@hotmail.com" in sign-in email box
			And I click on continue button
			Then I should see an error  "We cannot find an account with that e-mail address"
			
Scenario: Verify user cannot login using correct email and in-correct password
			When I type "autopracact@hotmail.com" in sign-in email box
			And I click on continue button
			When I type "selinium" in password box
			And I click on sign-in button
			Then I should see an error  "Your password is incorrect"

Scenario: Verify user can login using correct email and correct password
			When I type "autopracact@hotmail.com" in sign-in email box
			And I click on continue button
			When I type "Selinium" in password box
			And I click on sign-in button
			And I should be on "https://www.amazon.co.uk/?ref_=nav_ya_signin&" page 
				
			
				