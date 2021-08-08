@smoke
Feature: Login functionality

  @smoke
  Scenario Outline: Login functionality of multiple data on Hotel page
    Given User is on login page
    When User enters <username> and <password>
    And Click login button
    Then User lands on hotel home page

    Examples: 
      | username     | password   |
      | jack0709     | saikiraN07 |
      | jackloki     | jackloki   |
      | lokeshnaik09 | saikiran09 |
      | lokiloki7    | lokiloki7  |
