@FE
Feature: Dashboard functionality
  User Story: As a lendbuzz customer, I should have access to different modules

  Scenario: Verify that customers have access to 4 modules
    When user is on www.lendbuzz.com home page
    Then user sees 5 modules
    Then user should have access to modules