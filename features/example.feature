Feature: Testing Cucumber Integration

  Scenario: Cucumber Integration
    Given I have setup Play
    When I go to the landing page
    Then the title should be "Cucumber"
