Feature: As a user of the banistmo page,
  I need to do a search

  @Search
  Scenario: Search for Products y Services
    Given the user is on the main page
    When he types the words for the search
    Then he finds the result of his search