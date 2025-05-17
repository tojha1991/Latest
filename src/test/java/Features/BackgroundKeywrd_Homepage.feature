Feature: Test Homepage Scenarios

Background: 
Given User is on login page
When User enters Valid username "standard_user" and valid password "secret_sauce"
And User clicks on login button
Then Homepage should be displayed

Scenario: User is able to see the Title of the Homepage
When User is on Hompepage


Scenario: User should be able to logout of the application
Given User Hovers to the Hamburger menu
And User clicks on Logout link 
Then User should be logged out of the application
