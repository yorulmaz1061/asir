@wipr
Feature: User should be able to use functions under Employees menu

  Background:
    Given the user is on the login page
    When the user enters by using "hr99@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user clicks Employees button

  @OPC-694 @wipr
  Scenario:User should be able to display company structure.
    When the user should see the company structure


  @OPC-695 @wipr
  Scenario: User should be able to add a department.
    When the user clicks the ADD DEPARTMENT button
    And the user should write the new departmant name as "Ghan"
    And the user clicks the ADD button
    Then the user should see the new department under the Cyber Vet on the page

   @OPC-696 @wipr
  Scenario:User should be able to find employees by search box.
    When the user clicks the Find Employee button
    Then the user clicks the search box
    And the user writes the "Arben Istrefi" name
    And the user clicks the search button
    Then the user should see the name on the page

    @OPC-697 @wipr
  Scenario:User should be able to find employees by search by Alphabet.
    When the user clicks the Find Employee button
    And the user clicks the Ab Search By Alphabet
    Then the user clicks the "letter"
    Then the user should be see the "Arben Istrefi" on the page

  @OPC-698 @wipr
  Scenario: User should be able to display telephone directory
    When the user clicks the Telephone Directory button
    Then the user should be see the Telephone Directory page

  @OPC-699 @wipr
  Scenario: User should be able to send message to employee from the telephone directory

    When the user clicks the Telephone Directory button
      And the user clicks employee name
      And the user clicks the SEND MESSAGE button
      And the user writes "Good Job" message in the message box
      And the user clicks the message send button
      Then the user sees the message on the message display screen

  @OPC-700 @wipr
  Scenario: User should be able to export the employee list.
      When the user clicks the Find Employee button
      And the user clicks the Add More tab button
      And the user clicks the Export to Excel button
      And the user sees the list of names on the  dowloded Excel file



