# PetStore API Test Automation
- Based on Serenity+Cucumber4

# API test scenarios:
- Add pet to the store
 -Modify the same pet
- Delete this pet
- Find pets by status available

# Structure
  - src/test/java/api - Test runners and supporting code
  - src/test/resources/features - Feature files
  
# How to run:
  - Prerequisites: maven3, java8 or greater
  - Maven:
    - run command from base project: **mvn clean verify** 
    - html report is generated when running previous commands - open target/site/serenity/index.html after run
