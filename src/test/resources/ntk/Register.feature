 Feature: Create new account

  Scenario: Register to create new account
    Given User is on register page				 
    When User enters firstname		
    And User enters lastname	
    And User enters phone		 
    And User enters email
    And User enters Address
    And User enters city
    And User enters state
    And User enters zipcode
    And User chose country from dropdown
    And User enters User name		
    And User enters password
    And User enters confirm password		 
    And User clicks submit button			 
    Then verify Thank you for registering message 

 