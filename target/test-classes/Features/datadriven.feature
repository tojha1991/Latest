Feature: Verify login functionality

  Scenario Outline: Verify successfull login with valid details
    Given user is on login screen
    When user enters "<Username>" in username field and "<Password>" in password field
    And click on Submit button
    Then user is able to login into the application

    Examples: 
      | Username      | Password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
