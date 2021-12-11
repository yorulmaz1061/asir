@smoke
Feature: User should use the functionalities of CRM
  Background:
    Given the user is on the login page
    When the user enters by using "hr99@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user clicks Employees button

   Scenario: Able to click on the "High Priority" checkbox
    And clicks on Tasks button
    And clicks on New Task button
    And click on high priority checkbox
    Then User should be able to click high priority checkbox

  Scenario: User should be able to add custom menu item as Google to redirect google.com
    When the user click the add custom menu item
    And the user enters "name" and "link" information
    Then the user should see that item attached the menu

  Scenario: User should be able to send message to employee from the telephone directory

    When the user clicks the Telephone Directory button
    And the user clicks employee name
    And the user clicks the SEND MESSAGE button
    And the user writes "Good Job" message in the message box
    And the user clicks the message send button
    Then the user sees the message on the message display screen

