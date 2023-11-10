Feature: Login wih parameters
  Scenario: Login as librarian 11
    Given user on the login page
    When user enters username "librarian11@library" and enter password 'I61FFPPf'
    And click the sign in button
    Then dashboard should be displayed

  Scenario: Login as librarian 12
    Given user on the login page
    When user enters username "librarian12@library" and enter password 'AOYKYTMJ'
    And click the sign in button
    Then dashboard should be displayed
    And there should be 21542 users