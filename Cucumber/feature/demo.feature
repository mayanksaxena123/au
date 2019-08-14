Feature: Testing the Sign up process
Sign up shoulf be quick and friendly

  @tag1
  Scenario: Sucessfyl sign up
  new users should be greeeted personally by the site once signed in
    Given i have chosen to sign up
    When i sign up with"m.k.saxena123@gmail.com" and "mayank"
    Then Pass the UserName and Password 
    And i should see personalized greeting message
