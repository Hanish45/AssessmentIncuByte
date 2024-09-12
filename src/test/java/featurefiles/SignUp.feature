
Feature: Creating a User Account in LUMA and Signing in with it
 
 Background: User is on LUMA Website HomePage
    Given Navigating to homepage


  Scenario: Creating User Account
    Given Verifies the HomePage and clicks on Create an Account
    When User lands on registration page and enters the required details
    Then Clicking on Create an Account
    And User should be able to see Thank you Message on Screen 


  Scenario: Signing in to the website
    Given User clicks on Sign-in
    When Entering credentials in the Specified fields
    Then HomePage should be Displayed and should be able to see Welcome Hanish Pinja!
    


