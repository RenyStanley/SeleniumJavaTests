Feature: Verify links under Amazon Payment Methods

Background: 
		Given I am on Amazon homepage 
	
Scenario Outline: Verify all links in Amazon Payment Methods
		When I click on "<linkText>" link 
		Then I should be on "<pageurl>" page 
Examples: 
| linkText | pageurl |
|Track Packages or View Orders|https://www.amazon.co.uk/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dfooter_hp_ss_comp_tmp&pageId=webcs-yourorder&showRmrMe=1|
|Delivery Rates & Policies|https://www.amazon.co.uk/gp/help/customer/display.html/ref=footer_shiprates?ie=UTF8&nodeId=201910060|
|Amazon Prime|https://www.amazon.co.uk/amazonprime?_encoding=UTF8&ref_=footer_prime|
|Returns & Replacements|https://www.amazon.co.uk/gp/orc/returns/homepage.html/ref=orc_surl_ret_hp?fg=1|
|Manage Your Content and Devices|https://www.amazon.co.uk/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fmn%2Fdcw%2Fmyx.html%2Fref%3Dkinw_myk_redirect&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbamazon&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&accountStatusPolicy=P1|
|Amazon Mobile App|https://www.amazon.co.uk/Amazon-App/b/ref=footer_mobapp?ie=UTF8&node=4816518031|
|Amazon Assistant|https://www.amazon.co.uk/gp/BIT/ref=footer_bit_v2_e0001?bitCampaignCode=e0001|
|Help|https://www.amazon.co.uk/gp/help/customer/display.html/ref=footer_gw_m_b_he?ie=UTF8&nodeId=508510|