@smoke
Feature: : Login functionality

  @smoke
  Scenario: Login in  hotel app using valid credentials
    Given User is on login page of hotel
    When User enters the username and password
    And User clicks on login button
    Then User is on hotel home page
