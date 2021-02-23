Feature:  As a user, I should be able to login to the library app.
 @smoke
  Scenario Outline: After i login as a user/librarian related page should be opened
    When User login as a "<role>"

    Then Then title should contain "<page>"
Examples: below
      | role      | page      |
      | student   | books     |
      | librarian | dashboard |