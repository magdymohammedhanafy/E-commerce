@Test
Feature: users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
   Given user go to login page
   When user login with valid  "test2@example.com" and "P@ssw0rd"
   Then user press on login button
    And user login to the system successfully

  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login with invalid "wrong@example.com" and "P@ssw0rd"
    Then user press on login button
    And user could not login to the system

