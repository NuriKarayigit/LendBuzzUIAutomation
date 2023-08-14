package com.lendbuzz.stepDefs;
import com.lendbuzz.pages.HomePage;
import com.lendbuzz.pages.LoginPage;
import com.lendbuzz.utilities.BrowserUtilities;
import com.lendbuzz.utilities.ConfigurationReader;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US04_LoginFunctionNegTest {

    LoginPage loginPage = new LoginPage();

    @And("user clicks on My Account button")
    public void userClicksOnMyAccountButton() {
        loginPage.myAccountBtn.click();
    }


    @When("user enters invalid email address")
    public void user_enters_invalid_email_address() {
        BrowserUtilities.waitForVisibility(loginPage.loginText,15);
        loginPage.signInBox.sendKeys(ConfigurationReader.getProperty("email"));

    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {

        loginPage.signInPW.sendKeys(ConfigurationReader.getProperty("password"));


    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.logInBtn.click();


    }
    @Then("user sees the error message as {string}")
    public void user_sees_the_error_message_as(String string) {

        Assert.assertEquals(loginPage.errMsg.getText(),string);

    }


}
