Feature: Librarian user group category features

  Scenario Outline: as a librarian i should be able to sort user on users page
    When user login as a librarian
    Then user click on user button
    And sort "<users>"
    Examples: below
      | users     |
      | ALL       |
      | Librarian |
      | Students  |



