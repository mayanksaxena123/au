
Feature: Title of your feature
  I want to use this template for my feature file
@login
 Scenario: Login with valid Credentials
    Given Navigate to the home page
   
    When user enterusername and password
  
    Then user logged in sucessfully
    
  
   
  @data-driven
  Scenario Outline:change the some of the data and place the order
    Given Add the casual belt the cart
    When change the quantity
    Then proceed for checkout
