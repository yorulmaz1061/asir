

Feature: Login with in valid credentials

  Background:
    Given the user is on the login page

  @OPC-614 @wip
  Scenario: Login with different valid credentials
    When the user enters by using "helpdesks76@cybertekschool.com" and "UserUseR"
    Then the should not be on home page

  @OPC-615  @wip
  Scenario: Login with different valid credentials
    When the user enters by using "helpdesk76@cybertekschool.com" and "UserUseR"
    Then the should not be on home page

  @OPC-616 @wip
  Scenario: Login with different valid credentials
    When the user enters by using "helpdesKK76@cybertekschool.com" and "UserUser"
    Then the should not be on home page

  @OPC-617 @wip
  Scenario: Login with different valid credentials
    When the user enters by using "    " and "    "
    Then the should not be on home page

 @OPC-618 @wip
  Scenario: Login with different valid credentials
    When the user enters by using "  helpdesk79@cybertekschool.com  " and "    "
    Then the should not be on home page


