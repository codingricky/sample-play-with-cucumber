Feature: Testing Cucumber Integration

  Scenario: Cucumber Integration
    Given I have setup Play
    When I go to the landing page
    Then the title should be "Cucumber"

#  Scenario: Hello2
#    Given I am a test
#    When I test
#    Then I should see "Play"