
Feature: Add the Users
  Agile Story: As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.


  Background: :
    Given the user is on the login page
    When the user enters by using "helpdesk5@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user should click the Services button

  Scenario:
    Then the user clicks Ideas button
