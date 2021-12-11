
Feature:
  Agile Story: As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.


  Background: :
    Given the user is on the login page
    When the user enters by using "helpdesk5@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user should click the Services button
    Then the user clicks Ideas button


  Scenario:
    Then the user clicks New Idea button
    Then the user writes Title for New Idea
    Then the user writes Idea description
    Then the user clicks Suggest New Idea Button
    Then verify that message is displayed

  @TEKRARABAK
  Scenario:
    Then the user clicks like button
    Then verify that like button is clicked