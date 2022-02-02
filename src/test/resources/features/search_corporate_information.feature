Feature: As a user of the banistmo page,
  I need to search corporate information on sustainability
  to learn more about the company

  @SearhInformation
  Scenario: Search corporate information on sustainability
    Given the user navigates to the section acerca de nosotros
    When the user enters to the sustainability section
    And the user generates the desired document about sustainability
    Then the user should see the correct pdf file
