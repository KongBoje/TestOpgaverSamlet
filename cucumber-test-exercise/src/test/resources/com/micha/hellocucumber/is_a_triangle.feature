Feature: Is a trianlge?
  We wanna know when we have a triangle

  Scenario: find invalid triangle
    Given we have the sides <a>, <b> and <c>
    When we check to see if we have valid triangle
    Then I should be told that my triangle is <outcome>