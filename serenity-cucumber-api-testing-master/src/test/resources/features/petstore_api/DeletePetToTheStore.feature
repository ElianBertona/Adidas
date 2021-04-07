
Feature: Delete pet to the store
 				 I want to delete a pet to the store

  Scenario: Delete pet to the store
    When i add the pet "Black" to the store with state "available"
    And i delete the pet from the store
    Then the pets should be not available
    
