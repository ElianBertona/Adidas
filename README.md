# Adidas
# API and WEB Test Autoation using Serenity, Cucumber and Maven.

First steps:
Download and unzip the projects. 
Import the projects like maven projects to the IDE (I used Eclipse IDE).

Run the tests separately like this:

mvn clean verify

By default, the web tests run with Chrome browser, so you will need this installed.

The reports will be generated in target/site/serenity.

# API test scenario:
- Add pet to the store
- Modify the same pet
- Delete this pet
- Find pets by status available

# Web BDD test scenario:
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
