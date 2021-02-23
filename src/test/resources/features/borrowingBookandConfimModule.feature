Feature: As a user, I should able to see my borrowing books.

  Scenario: borrowing books

    Given i login as a user
    When the user click Borrowing Books module
    Then the user should be see to the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Data       |
      | Planned Return Data |
      | Return Data         |
      | Is Returned         |


