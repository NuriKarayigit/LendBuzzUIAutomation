@FE
Feature: Verify login function

  User Story: Verify that users can not login with invalid credentials

  Scenario: Verify the login error message when user enters invalid credentials
    When user is on www.lendbuzz.com home page
    And user clicks on My Account button
    And user enters invalid email address
    And user enters invalid password
    And user clicks on login button
    Then user sees the error message as "The email and password you entered are incorrect"