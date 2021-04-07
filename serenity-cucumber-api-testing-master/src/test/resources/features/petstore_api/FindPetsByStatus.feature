Feature: Find all pets by status
 				 I want to get all pets of the store by status

  Scenario: Find all pets with the state available
    When i search the pets with status "available" from the web store
    Then i should receive success status from the searching by "available"
