@FE

Feature: Verify contact function

  User Story: Verify that Lendbuzz mailing address

  Scenario: Verify Lendbuzz mailing address as expected
    When user is on www.lendbuzz.com home page
    And user scrolls down to bottom of the page
    And user clicks on Contact Us button
    Then user sees lendbuzz mailing address as "100 Summer St, Suite 3150 Boston, MA 02110"
