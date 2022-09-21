@Test
Feature: follow us
  Scenario: using facebook tab
    Given click on facebook tab
    When moves between two tabs
    Then Assertion with Url link on facebook tab

  Scenario: using twitter tab
    Given click on twitter tab
    When moves between two tabs
    Then Assertion with Url link on twitter tab

  Scenario: using rss tab
    Given click on rss tab
    #When moves between two tabs
    Then Assertion with Url link on rss tab

  Scenario: using youtube tab
    Given click on youtube tab
    When moves between two tabs
    Then Assertion with Url link on youtube tab