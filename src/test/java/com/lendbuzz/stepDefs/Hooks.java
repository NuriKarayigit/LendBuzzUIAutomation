package com.lendbuzz.stepDefs;

import com.lendbuzz.utilities.BrowserUtilities;
import com.lendbuzz.utilities.ConfigurationReader;
import com.lendbuzz.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUpMethod() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } else {
        }

        BrowserUtilities.sleep(1);

        Driver.closeDriver();

    }
}






