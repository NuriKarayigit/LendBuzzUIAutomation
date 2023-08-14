package com.lendbuzz.pages;

import com.lendbuzz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "loginLink")
    public WebElement myAccountBtn;


    @FindBy(xpath = "//h3[@class='text-center']")
    public WebElement loginText;

    @FindBy(id = "signin_email")
    public WebElement signInBox;


    @FindBy(id = "signin_password")
    public WebElement signInPW;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInBtn;

    @FindBy(xpath = "//div[@class='text-sm md:text-base mt-2 text-warning']")
    public WebElement errMsg;


}
