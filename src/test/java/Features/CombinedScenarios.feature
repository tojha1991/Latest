Feature: Login functionality

@Regression @Login
  Scenario: Check login is successfull with valid credentials
    Given User is on login page and enters valid username "standard_user" into username field
    When User has entered valid password "secret_sauce" into the password field
    And user clicks on Submit button
    Then user is able to logged into the application successfully
    
@Sanity @InvalidLogin
  Scenario: Check user is unable to login with Invalid credentials
    Given User is on login page and enters invalid username "Standrd_User" into username field
    When User has entered invalid password "Sauce_Labs" into the password field
    And user clicks on the Submit button
    Then user is getting an error message on the page