Feature: Login wih parameters

  @librarianParam
  Scenario: Login as librarian 11
    Given user on the login page
    When user enters username "librarian11@library"
    And user enter password 'I61FFPPf'
    And click the sign in button
    Then there should be 665 users
    Then dashboard should be displayed

  @studentParam
  Scenario: Login as student 30
    Given user on the login page
    When user enters username "student30@library" and enters password 'IaT9YI0I'
    And click the sign in button
    Then books should be displayed
