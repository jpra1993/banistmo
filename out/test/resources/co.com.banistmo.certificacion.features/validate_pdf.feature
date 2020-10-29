Feature: As a user of the banistmo page,
  I need to validate that the generated pdf for
  Banikids Deposit Account Fees

  @ValidatePDF
  Scenario: Validate banikids deposit account fees pdf
    Given the user navigates to the banikids page
    When he downloads generated pdf
    Then he should see the correct pdf file