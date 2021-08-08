Feature: Login functionality check

  @hooks
  Scenario: Checking the login functionality with valid credentials
    Given User is on login page of the website
    When User enters valid username and  password
    And User enter login buutton
    Then User lands on home page
