Feature: Search functionality on the users page
  As a user, when I login as a librarian and I go to users page, then table should have followings columns:

  @wip
  Scenario: Table columns names
    Given user on the login page
    And user on the login page
    And user click on "Users" link
    Then table should have following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |
