Feature: To Test Valid login functionality

  Scenario Outline: Check login is successfull with valid credentials
    Given user is on the login page
    When user enter <username> and <password>
    And click on Submit button
    Then user able to log in
    
    Examples: 
    |username|password|
    |standard_user|secret_sauce|
    |problem_user|secret_sauce|