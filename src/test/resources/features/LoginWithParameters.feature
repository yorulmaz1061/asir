
Feature: Login with in valid credentials

  Scenario : Login with different valid credentials
    Given the user is on the login page
    When the user enters by using "helpdesks76@cybertekschool.com" and "UserUseR"
    Then the should not be on home page
