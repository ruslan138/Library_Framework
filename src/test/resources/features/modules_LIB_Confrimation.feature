Feature:  As a librarian, I should be able to  see seveal modules once I login.

  Scenario: As a librarian i should be able to see 3 modules
    Given user login as a librarian
    Then the user should see following librarian modules
      | Dashboard       |
      | Books           |
      | Borrowing Books |