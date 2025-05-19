Feature: To Test Valid login functionality

  Scenario: Test login is successfull with valid credentials
    Given A user is on the login page
    When a user enters credentials using datatable
    |standard_user|secret_sauce|
    And it click on Submit button
    Then user should be able to log in
    