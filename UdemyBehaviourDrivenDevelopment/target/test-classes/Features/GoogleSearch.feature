Feature: Feature to test google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    And User is on google page
    When User enters a text in serach box
    And hits enter
    Then User is navigated to the serach result page
