

Feature: Login Functionality

  @Login1
  Scenario: Login with valid Credentials
    Given Navigate to the home page
   
    When user enterusername and password
  
    Then user logged in sucessfully
    
@data-driven1
  Scenario Outline:change the some of the data and place the order
    Given Add the casual belt the cart
    When change the quantity
    Then proceed for checkout
 