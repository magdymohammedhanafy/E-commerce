@Test
Feature: users could register with new account
  Scenario: user could register with valid data successfully
    Given user goto register page
    When user select gender type
    Then user enter first name "automation" and last name "tester"
    Then user enter date of birth
    Then user enter email "ttestFinal@example.com" field
    Then user fills Password fields "P@ssw0rd" "P@ssw0rd"
    Then user clicks on register button
    And applied Soft assertion as required for all scenarios