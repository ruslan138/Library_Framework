Feature:  As a librarian, I should be able to add users from users page

  Scenario: librarian should be able to login and then add user
    When user login as a librarian
    Then user click on user button
    Then  add new user
    And then librarian shoulbe able change userInfo



