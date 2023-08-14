package com.lendbuzz.stepDefs;

import com.lendbuzz.pages.QualificationPage;
import com.lendbuzz.utilities.BrowserUtilities;
import com.lendbuzz.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.lang.module.Configuration;

public class US05_PreQualificationFunction {

    QualificationPage qualificationPage = new QualificationPage();

    @When("user clicks on Prequalify Now button")
    public void user_clicks_on_prequalify_now_button() {
        qualificationPage.qualifyBtn.click();
    }

    @When("user selects the loan amount")
    public void user_selects_the_loan_amount() {
        System.out.println("30,000 selected by default");
    }

    @When("user selects the loan term")
    public void user_selects_the_loan_term() {

        qualificationPage.termBtn.click();
        System.out.println("3 year term selected");

    }

    @When("user enters the estimated purchase price")
    public void user_enters_the_estimated_purchase_price() {
        BrowserUtilities.scrollToElement(qualificationPage.personalHeader);
        qualificationPage.estPurchase.sendKeys("32000");

    }

    @When("user enters the VIN \\(optional)")
    public void user_enters_the_vin_optional() {
        qualificationPage.vinNum.sendKeys("1234567891323ADJNAJKDN");
    }

    @When("user enters the year of the vehicle")
    public void user_enters_the_year_of_the_vehicle() {
        qualificationPage.vehicleYear.sendKeys("2018");
    }

    @When("user enters the make of the vehicle")
    public void user_enters_the_make_of_the_vehicle() {
        qualificationPage.vehicleMake.sendKeys("Mercedes-Benz");
    }

    @When("user enters the model of the vehicle")
    public void user_enters_the_model_of_the_vehicle() {
        qualificationPage.vehicleModel.sendKeys("GLC-300");
    }

    @When("user enters the trim of the vehicle")
    public void user_enters_the_trim_of_the_vehicle() {
        qualificationPage.vehicleTrim.sendKeys("4 Door");
    }

    @When("user selects the vehicle type")
    public void user_selects_the_vehicle_type() {
        qualificationPage.vehicleHist.click();
    }

    @When("user enters the mileage of vehicle \\(optional)")
    public void user_enters_the_mileage_of_vehicle_optional() {
        qualificationPage.vehicleMileage.sendKeys("1500");
    }

    @When("user enters email address")
    public void user_enters_email_address() {
        BrowserUtilities.scrollToElement(qualificationPage.scrollD);
        qualificationPage.email.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @When("user pick how did you hear about us")
    public void user_pick_how_did_you_hear_about_us() {

        Select select = new Select(qualificationPage.selectDD);
        select.selectByVisibleText("Friend");

    }

    @When("user clicks on the check box on captcha")
    public void user_clicks_on_the_check_box_on_captcha() {
        BrowserUtilities.sleep(15);
    }

    @When("user clicks on the check box on captch")
    public void user_clicks_on_the_check_box_on_captch() {

    }

    @When("user clicks on the Next:Education button")
    public void user_clicks_on_the_next_education_button() {
        qualificationPage.nextEducBtn.click();
    }

    @When("user selects their country")
    public void user_selects_their_country() {

        Select select = new Select(qualificationPage.selectCountry);
        select.selectByValue("US");
    }

    @When("user selects their school")
    public void user_selects_their_school() {
qualificationPage.schoolName.sendKeys("University of Texas");
    }

    @When("user selects their school status")
    public void user_selects_their_school_status() {
        Select select = new Select(qualificationPage.schoolStatus);
        select.selectByValue("current");
    }

    @When("user selects their school time period")
    public void user_selects_their_school_time_period() {
        qualificationPage.schoolStartDate.sendKeys("01/01/2012");
    }

    @And("user selects their school email")
    public void userSelectsTheirSchoolEmail() {
qualificationPage.schoolEmail.sendKeys(ConfigurationReader.getProperty("schoolEmail"));
    }

    @When("user selects their degree type")
    public void user_selects_their_degree_type() {
        Select select = new Select(qualificationPage.degreeType);
        select.selectByValue("B.A");
    }

    @When("user selects their major type")
    public void user_selects_their_major_type() {
        Select select = new Select(qualificationPage.major);
        select.selectByValue("Information Technology (IT)");
    }

    @When("user clicks on next:employment button")
    public void user_clicks_on_next_employment_button() {
qualificationPage.nextEmpBtn.click();
    }

    @When("user fills out their employment history")
    public void user_fills_out_their_employment_history() {

    }

    @When("user clicks on next button")
    public void user_clicks_on_next_button() {

    }

    @When("user fills out their income information")
    public void user_fills_out_their_income_information() {

    }

    @When("user clicks on next:personal button")
    public void user_clicks_on_next_personal_button() {

    }

    @When("user fills out their personal information")
    public void user_fills_out_their_personal_information() {

    }

    @When("user clicks on next:review button")
    public void user_clicks_on_next_review_button() {

    }

    @Then("user sees the error message listed {string}")
    public void user_sees_the_error_message_listed(String string) {

    }


}
