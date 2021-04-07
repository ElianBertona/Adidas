Feature: Add two products to my cart delete one and purchase
         I want to add products to my cart and purchase one and check the amout

  Scenario: Add products to my cart and purchase one
    Given user is on the home page
    And user is login on the store as "demoUser"
    When user navigate to "Laptops"
    And user add the "Sony vaio i5" to the cart
    And user navigate to "Laptops"
    And user add the "Dell i7 8gb" to the cart
    And user delete "Dell i7 8gb" from the cart
    And user place the order
    And user fill all the payment fields "Name" "Spain" "Barcelona" "202220009872" "06" "2024"
    Then user should see the "790" in the confirmation popup
