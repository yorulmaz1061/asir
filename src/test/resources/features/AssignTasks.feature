
@AssignTaskTest
Feature: As a user, I should be able to assign tasks under Quick Navigate Menu


  Background:
    Given the user is on the login page
    When the user enters by using "hr99@cybertekschool.com" and "UserUser"
    Then the user should be on the home page


  @OPC-421
  Scenario: Able to click on the "High Priority" checkbox
    And clicks on Tasks button
    And clicks on New Task button
    And click on high priority checkbox
    Then User should be able to click high priority checkbox


  @OPC-422
  Scenario: Click on Visual Editor and see the editor text bar


    And Clicks on MESSAGE link button
    And Click on the A button
    Then User can display the Visual text editor text bar

  @OPC-423
  Scenario:Adding a checklist item by clicking the add button


    And Click on Tasks button
    And Click on New Task button
    And Click on the checklist button
    And Click on the Things To Do input field
    And Enter the word demo and click Enter
    Then Verify that the user can see the entered text in a new added line with a checkbox


  @OPC-424
  Scenario: Adding new separator lines


    And Click on Tasks button
    And Click on New Task button
    And Click on the checklist button
    And Click on the separator button
    Then User is able to add separator lines

  @OPC-425
  Scenario:Deleting checklist items


    And Click on Tasks button
    And Click on New Task button
    And Click on the checklist button
    And Click on the Things To Do input field
    And Enter text demo and click Enter
    And Click one the X button
    Then User is able to delete the checkbox item

  @OPC-426
  Scenario:Adding deadline,time planning by using date pickers


    And Click on Tasks button
    And Click on New Task button
    And Click on things to do input field
    And Enter text demo and click Enter
    And Click on the Deadline input field
    And Select a date
    And Click on select button
    And Click on add task button
    Then User is able to display the entered text demo

  @OPC-427
  Scenario:Sending tasks


    And Click on Tasks button
    And Click on New Task button
    And Click on things to do input field
    And Enter text demo and click Enter
    And Click on add task button
    Then User is able to add tasks

  @OPC-484
  Scenario:Verify that user can not add  a new checklist if the input field is blank by clicking the add button


    And Click on Tasks button
    And Click on New Task button
    And Click on the checklist button
    And Click on add checklist button
    Then User is not able to add a new checklist by leaving input field blank and clicking add button



