package com.lendbuzz.stepDefs;

import com.lendbuzz.pages.HomePage;
import com.lendbuzz.utilities.BrowserUtilities;
import com.lendbuzz.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class US03_MailingAddressVerification {

    JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
    HomePage homePage = new HomePage();


    @And("user scrolls down to bottom of the page")
    public void user_scrolls_down_to_bottom_of_the_page() {


        for (int i = 0; i < 10; i++) {
        BrowserUtilities.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }

    }

    @And("user clicks on Contact Us button")
    public void userClicksOnContactUsButton() {

        homePage.contact.click();

    }

    @Then("user sees lendbuzz mailing address as {string}")
    public void user_sees_lendbuzz_mailing_address_as(String mailingAddress) {

        for (int i = 0; i < 10; i++) {
            BrowserUtilities.sleep(1);
            js.executeScript("window.scrollBy(0,750)");
        }

        Assert.assertEquals(homePage.mailingAddress.getText(), mailingAddress);

        System.out.println("Mailing address = " + homePage.mailingAddress.getText());


    }



}
