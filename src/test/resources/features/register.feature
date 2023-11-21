Feature: Register an user in thomascook application

  @register
  Scenario Outline: Register user and get successful messege
    Given user is on thomascook homepage
    When user clicks on loginbutton
    And clicks on register
    And user fills in their details
    And user clicks register button
    Then user is navigated to homepage with user logged in

