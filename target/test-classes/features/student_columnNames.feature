Feature:6. As a students, I should be able to see tables with default info

  Scenario: Table columns names

    Given i login as a user
    Then the user should be see the following column names:


      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

