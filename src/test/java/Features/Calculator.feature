Feature: This feature will allow you do to all the calculator operations
@Sanity
  Scenario: To add two numbers and validate the results are coming fine
    Given I have two numbers 5 and 6
    When I add those two numbers
    Then I should get the result as 11

  Scenario: To sub two numbers and validate the results are coming fine
    Given I have two numbers 11 and 6
    When I sub those two numbers
    Then I should get the result as 5
