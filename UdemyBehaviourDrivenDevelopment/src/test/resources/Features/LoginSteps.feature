@smoke
Feature: Feature to test login functionality

  @smoke
  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When User enters username and password
    And Clicks on submit button
    Then User is navigated to the home page
