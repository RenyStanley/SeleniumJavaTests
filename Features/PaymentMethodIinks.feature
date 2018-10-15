Feature: Verify links under Amazon Payment Methods

Background: 
		Given I am on Amazon homepage 
	
Scenario Outline: Verify all links in Amazon Payment Methods
		When I click on "<linkText>" link 
		Then I should be on "<pageurl>" page 
	Examples: 
		| linkText | pageurl |
		|Amazon Platinum Mastercard|https://www.amazon.co.uk/gp/cobrandcard/marketing.html/ref=footer_cbcc?ie=UTF-8&place=camp&plattr=footer&pr=ukndplat|
		|Amazon Classic Mastercard|https://www.amazon.co.uk/gp/cobrandcard/marketing.html/ref=footer_cbcc?ie=UTF-8&place=camp&plattr=footer&pr=ukndclas|
		|Amazon Money Store|https://www.amazon.co.uk/compare-credit-card-offers/b/ref=footer_ccmp?ie=UTF8&node=367529031|
		|Gift Cards|https://www.amazon.co.uk/Giftcards-Giftvouchers-Vouchers-Birthday-Gifts/b/ref=footer_giftcards?ie=UTF8&node=1571304031|
		|Amazon Currency Converter|https://www.amazon.co.uk/gp/help/customer/display.html/ref=footer_tfx?ie=UTF8&nodeId=201895380|
		|Payment Methods Help|https://www.amazon.co.uk/gp/help/customer/display.html/ref=footer_payment?ie=UTF8&nodeId=201894900|
		|Shop with Points|https://www.amazon.co.uk/dp/B01LTI1RBC/ref=footer_pay_shop|
		|Top Up Your Account|https://www.amazon.co.uk/b/ref=footer_topup_uk?ie=UTF8&node=13958953031|
		