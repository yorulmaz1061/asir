
Feature: Interact with employees
  Agile Story: As a user, I should be able to interact with employees on the posts that I have access to


  Background:
    Given the user is on the login page
    When the user enters by using "helpdesk77@cybertekschool.com" and "UserUser"
    Then the user should be on the home page
    Then the user should click the send a message box


  @OPC-659 @wip @smoke
  Scenario: user able to like on other employees posts
    Then the user clicks on like button
    Then the user see a text that says You under like link



#  Scenario: Add users by selecting multiple contacts from Employee and Departments contact lists
#
#    Then the user clicks the Add More button
#    And  the user clicks the Employees and departments
#    And  the user clicks the new department's name
#    And the user clicks the All department and subdepartment employees
#    And the user clicks the first user
#    And the user clicks the second user
#    And the user clicks the third user
#    Then clicked users are seen in the receiver box filed
#
#
#  Scenario: attach a link by clicking on the link icon
#
#    Then  the user clicks the link icon
#    And   the user writes the link text in the Text box
#    And   the user writes the link url in the Link box
#    And   the user clicks the Save button
#    And   the user clicks the SEND button
#    Then  link text is seen on the Active Stream page
#
#
#  Scenario:  add the mention by clicking the add mention icon
#
#    When  the user clicks Add mention icon
#    And  the user clicks the Employees and departments
#    And the user selects the first user
#    And the user clicks Add mention icon
#    And the user clicks the Employees and departments
#    And the user selects the second user
#    And the user clicks Add mention icon
#    And the user clicks the Employees and departments
#    And the user selects the third user
#    Then clicked users are seen in the receiver box filed
#
#  Scenario: add questions and multiple answers
#
#
#    When  nine the user writes a question in the Question box
#    And the user writes an answer in the Answer 1 box
#    And the user writes another answer in the Answer 2 box
#    And the user writes another answer in the Answer 3 box
#    And the user clicks the add question button
#    And the user writes a question in the new Question box
#    And the user writes an answer in the new Answer 1 box
#    And the user writes another answer in the new Answer 2 box
#    And the user writes another answer in the new Answer 3 box
#    And the user writes a message in the message box
#    And the user clicks the Send button
#    Then the user see the questions and answers on the home page






