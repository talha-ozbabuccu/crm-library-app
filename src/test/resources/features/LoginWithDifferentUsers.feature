Feature: User account tests
  As a user, I should be able to login with different usersusing their correct emails and passwords
  when I login, I should be able to see username in the account username section.

  @all_accounts
  Scenario Outline: Verify user information <email>
    Given user on the login page
    When user login using "<email>" and "<password>"
    Then account holder name should be "<name>"
#TEST DATA
    @students
    Examples:
      | email             |  | password |  | name            |
      | student27@library |  | kkMks02i |  | Test Student 27 |
      | student28@library |  | 19Ceq2sT |  | Test Student 28 |
      | student29@library |  | WyIUNpDI |  | Test Student 29 |

    @librarians