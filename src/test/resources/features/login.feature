Feature: Login feature

  @librarian
  Scenario: Login as a Librarian
    Given user on the login page
    When user login as a librarian
    Then dashboard should be displayed

  @student
  Scenario: Login as a student
    Given user on the login page
    When user login as a student
    Then books should be displayed


