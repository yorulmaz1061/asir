@asr
Feature: User should be able to send appreciation

Background:
Given the user is on the login page
When the user enters by using "helpdesk96@cybertekschool.com" and "UserUser"
Then the user should be on the home page
Then the user should click the activitystream button


  Scenario: User should be able to click on upload file
    When the user click on the more button
    And the user click on appreciation button
    Then the user should see uploadfile icon
