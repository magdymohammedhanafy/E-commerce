@Test
Feature: hover on  main categories
  Scenario: hover on one of main categories then click on
  sub category
    When select random one of the three main categories
    Then select sub-category and Assert that the sub-category title is (equal or contains) the one you get
