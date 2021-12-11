
Feature: FilterAndSearch Function
  @yts1
  Scenario: FilterAndSearch Function (display)
    Given the user is on the login page
    And the user enters hr user information
    When the user clicks on FilterAndSearch inputbox
    Then the user should display WorkButton
  @yts2
  Scenario:Add WorkButton function
    Given the user is on the login page
    And the user enters hr user information
    And the user clicks on FilterAndSearch inputbox
    When the user clicks on WorkButton
    Then the user should display TaskButton disappered
  @yts3
  Scenario:Close workflows function
    Given the user is on the login page
    And the user enters hr user information
    And the user clicks on FilterAndSearch inputbox
    And the user clicks on WorkButton
    When the user closes WorkCloseButton
    Then the user should display TaskButton disappered


  @yts4
  Scenario:Use the save filter
    Given the user is on the login page
    And the user enters hr user information
    And the user clicks on FilterAndSearch inputbox
    When the user clicks SaveFilterButton
    And the user sendkeys on FilterName
    And the user clicks on SaveButton
    And the user clicks on SearchButton
    Then the user should display TaskButton disappered

  @yts5
  Scenario: search by selected Type
    Given the user is on the login page
    And the user enters hr user information
    And the user clicks on FilterAndSearch inputbox
    When the user clicks on TypeInputBox
    And the user clicks on PostsButton
    And the user clicks on SearchButton
    Then the user should display TaskButton disappered


