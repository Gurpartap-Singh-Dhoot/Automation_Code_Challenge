Feature: Update Personal Information in My Account
Description: The purpose of this feature is to update the first name of the user.

  Background: User is logged in
    Given Navigate to "http://automationpractice.com" Site
	  And Click on Sign In link on Home Page
	   When User enters "gurpartap.dhoot@gmail.com" and "guru123" and logs in
		Then User is logged in 

	Scenario Outline: Update Personal Information in My Account
		Given User Click on My Personal Information 
		When User enters <firstname> and <password> and submit the form
		Then Verify <message> gets displayed
		
    Examples: 
      | firstname  | password | message  |
      | selenium   | guru123  | Your personal information has been successfully updated.|
      | selenium12 | abc      | The password you entered is incorrect.|
      | 123        | guru123  |	firstname is invalid. |
      | selenium   | abc      | The password you entered is incorrect.|
      |	aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa	|	guru123 |firstname is too long. Maximum length: 32|
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa	| guru123	|Your personal information has been successfully updated.|
