Feature: Order T-Shirt and Verify in Order History
Description: The purpose of this feature is to order T-Shirt and validate in Order History

   Background: User is logged in
    Given Navigate to "http://automationpractice.com" Site
	  And Click on Sign In link on Home Page
	  When User enters "gurpartap.dhoot@gmail.com" and "guru123" and logs in
		Then User is logged in 
		
  Scenario Outline: User place an order of Tshirt
    Given User is on My Account Page
    When User click on TSHIRTS 
    And Add the Tshirt to the cart
    And User click on Proceed to checkout on cart details page and navigates to Summary page
    And User click on Proceed to checkout on Summary page and navigates to Address page
    And User click on Proceed to checkout on Address page and navigates to Shipping page
    And Check the Terms of Service
    And User click on Proceed to checkout on Shipping page and navigates to Payment page
    And Select Payment method as <payment> method and click on I confirm my order on Payment page 
    And User click on back to orders
    Then User validate the order
    And User signed out
    

    Examples: 
      | payment   |
      | Pay by bank wire | 
      | Pay by check.    | 
