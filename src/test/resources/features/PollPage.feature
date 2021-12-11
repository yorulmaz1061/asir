@poll
  Feature: Add the Users
   Agile Story: As a user,I  should be able to create a  poll by clicking on Poll tab under Active Stream


   Background:
        Given the user is on the login page
        When the user enters by using "helpdesk96@cybertekschool.com" and "UserUser"
        Then the user should be on the home page
        Then the user should click the poll button


   @OPC-620 @poll
    Scenario: Add users by selecting multiple contacts from Employee and Departments contact lists

      Then the user clicks the Add More button
      And  the user clicks the Employees and departments
      And the user clicks the first user
      And the user clicks the second user
      And the user clicks the third user
      And the user clicks the fourth user
      Then clicked users are seen in the receiver box filed

    @OPC-621 @poll
      Scenario: attach a link by clicking on the link icon

        Then  the user clicks the link icon
        And   the user writes the link text in the Text box
        And   the user writes the link url in the Link box
        And   the user clicks the Save button
        And   the user clicks the SEND button
        Then  link text is seen on the Active Stream page

    @OPC-622  @poll
      Scenario:  add the mention by clicking the add mention icon

        When  the user clicks Add mention icon
        And  the user clicks the Employees and departments
        And the user selects the first user
        And the user clicks Add mention icon
        And the user clicks the Employees and departments
        And the user selects the second user
        And the user clicks Add mention icon
        And the user clicks the Employees and departments
        And the user selects the third user
        Then clicked users are seen in the receiver box filed


    @OPC-623 @poll
        Scenario: add questions and multiple answers

          When the user writes a question in the Question box
          And the user writes an answer in the Answer one box
          And the user writes another answer in the Answer two box
          And the user writes another answer in the Answer three box
          And the user clicks the add question button
          And the user writes a question in the second Question box
          And the user writes an answer in the new Answer one box
          And the user writes another answer in the new Answer two box
          And the user writes another answer in the new Answer three box
          And the user writes a message in the message box
          And   the user clicks the SEND button
          Then the user see the questions and answers on the home page


   @OPC-624 @poll
    Scenario: send a poll

      When the user writes a question in the Question box
      And the user writes an answer in the Answer one box
      And the user writes another answer in the Answer two box
      And the user writes another answer in the Answer three box
      And the user clicks the add question button
      And the user writes a question in the second Question box
      And the user writes an answer in the new Answer one box
      And the user writes another answer in the new Answer two box
      And the user writes another answer in the new Answer three box
      And the user writes a message in the message box
      And   the user clicks the SEND button




