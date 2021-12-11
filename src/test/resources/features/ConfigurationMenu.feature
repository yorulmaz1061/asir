@xxx
Feature: As a user, I should be able to configure menu;
  Background:
    Given the user is on the login page
    When the user enters by using "hr99@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user click the configure menu

  Scenario: User should be able to add custom menu item as Google to redirect google.com
    When the user click the add custom menu item
    And the user enters "name" and "link" information
    Then the user should see that item attached the menu