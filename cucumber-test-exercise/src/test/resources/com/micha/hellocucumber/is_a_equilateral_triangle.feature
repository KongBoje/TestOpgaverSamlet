Feature: Is a trianlge?
  We wanna know when we have a triangle

  Scenario: find equilateral triangle
    Given we wanna make a triangle
    When we give all sides the same length
    Then I should be told that "This is an equilateral triangle"