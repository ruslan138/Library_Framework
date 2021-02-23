Feature: As a user or Librarian i should be able to logout from the app

  Scenario: As a user i should be able login first and logout
    When i login as a user
    Then i should be able to logout
    And  return to the login page