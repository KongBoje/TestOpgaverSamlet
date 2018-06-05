Feature: Is a trianlge?
  We wanna know when we have a triangle

  Scenario: find invalid triangle
    Given we wanna make a isoscele triangle
    When two sides have the same length
    And two sides are longer that the third
    Then we should be told "This is an isoscele triangle"