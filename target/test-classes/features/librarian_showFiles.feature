Feature: Dropdowns check as librarian

  Scenario Outline: verify default values in Users page
    Given  user login as a librarian
    Then I click on Users link
    Then show records default value should be "10"
    And show records should have following "<options>"
    Examples:dropdowns options

      | options |
      | 5       |
      | 10      |
      | 15      |
      | 50      |
      | 100     |
      | 200     |
      | 500     |