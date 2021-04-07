
Feature: Update pet status
         I want to update a pet status

  Scenario: Update pet status
    When i add the pet "Black" to the store with state "available"
    And i update the pet status as "sold"
    Then the pet should be updated