Feature: Librarian should be able to see following columns

  Scenario: librarian columns
    Given user login as a librarian
    When user click on user button
    Then the librarian should be able see the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


