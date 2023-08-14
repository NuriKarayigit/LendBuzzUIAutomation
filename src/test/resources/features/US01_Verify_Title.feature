
@FE
Feature: lendbuzz Website Header Verification

  User Story: As a lendbuzz customer I should be able to land to home page and see title


  Scenario: verify the web browser header
    When user is on www.lendbuzz.com home page
    Then Checks if the title is displayed as "Welcome to Lendbuzz"
