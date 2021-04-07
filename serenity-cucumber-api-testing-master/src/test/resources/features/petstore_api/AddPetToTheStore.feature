Feature: Add pet to the store
  			 I want to add a pet to the store

  Scenario: Add pet to the store
    When i add the pet "Black" to the store with state "available"
    Then the pet should be available
   	
 
