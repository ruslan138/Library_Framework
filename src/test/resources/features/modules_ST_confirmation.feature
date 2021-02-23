Feature:  As a user, I should be able to  see several modules once I login.

  Scenario: As a student i should be able to see 2 modules
    Given i login as a user
    Then the user should see following modules

      | Books           |
      | Borrowing Books |




