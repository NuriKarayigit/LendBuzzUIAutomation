package com.lendbuzz.stepDefs;
import com.lendbuzz.pages.HomePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Optional;

public class US02_DashBoardFunctions {

    HomePage homePage = new HomePage();

    @Then("user sees {int} modules")
    public void user_sees_modules(int expected4) {

        List<WebElement> four = homePage.modules;

        int count = 0;
        for (WebElement eachModule : four){
            if (eachModule.getText().equalsIgnoreCase("")){
                continue;
            }
            count++;
            System.out.println(count+" "+ eachModule.getText());
        }
        Assert.assertEquals(expected4, four.size());
    }
    @Then("user should have access to modules")
    public void user_should_have_access_to_modules() {



    }

}
