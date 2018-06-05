Feature: Is a trianlge?
  We wanna know when we have a triangle

  Scenario: find invalid triangle
    Given we wanna make a scalene triangle
    When no sides have the same length
    And two sides are longer that the third
    Then I should be toldd "This is a scalene triangle"