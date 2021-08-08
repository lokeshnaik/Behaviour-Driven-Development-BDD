Feature: Login functionality

  @smokeTest
  Scenario: Login functionality of nop commerce website
    Given User is on login page of website
    When User enter the username and password
    And Clicks on login button
    Then user is on home page of nope commerence website
