@FE
Feature: Pre-qualification function

  User Story: Verify that users can use pre-qualification function

  Scenario: Verify pre-qualification function works as expected
    When user is on www.lendbuzz.com home page
    And user clicks on Prequalify Now button
    And user selects the loan amount
    And user selects the loan term
    And user enters the estimated purchase price
    And user enters the VIN (optional)
    And user enters the year of the vehicle
    And user enters the make of the vehicle
    And user enters the model of the vehicle
    And user enters the trim of the vehicle
    And user selects the vehicle type
    And user enters the mileage of vehicle (optional)
    And user enters email address
    And user pick how did you hear about us
    And user clicks on the check box on captcha
    And user clicks on the check box on captch
    And user clicks on the Next:Education button
    And user selects their country
    And user selects their school
    And user selects their school status
    And user selects their school time period
    And user selects their school email
    And user selects their major type
    And user clicks on next:employment button
    And user fills out their employment history
    And user clicks on next button
    And user fills out their income information
    And user clicks on next:personal button
    And user fills out their personal information
    And user fills out their personal information
    And user clicks on next:review button
    Then user sees the error message listed "Nice! You have completed all the sections."
