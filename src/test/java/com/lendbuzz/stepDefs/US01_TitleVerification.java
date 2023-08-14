package com.lendbuzz.stepDefs;

import com.lendbuzz.utilities.BrowserUtilities;
import com.lendbuzz.utilities.ConfigurationReader;
import com.lendbuzz.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US01_TitleVerification {

    @When("user is on www.lendbuzz.com home page")
    public void user_is_on_www_lendbuzz_com_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("Checks if the title is displayed as {string}")
    public void checks_if_the_title_is_displayed_as(String string) {

        Assert.assertEquals(Driver.getDriver().getTitle(),string);
        System.out.println(Driver.getDriver().getTitle()); // to display the title on the console
        BrowserUtilities.sleep(2);


    }

}
