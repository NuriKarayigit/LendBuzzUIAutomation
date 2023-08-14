package com.lendbuzz.pages;

import com.lendbuzz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualificationPage {
    public QualificationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='Prequalify Now']")
    public WebElement qualifyBtn;

    @FindBy(xpath = "//*[@id=\"_year_rates\"]/div/div/div[1]/button")
    public WebElement termBtn;

    @FindBy(xpath = "(//h2[@class='title']/span)[2]")
    public WebElement personalHeader;

    @FindBy(name = "loan_application[automobile][asset_value]")
    public WebElement estPurchase;

    @FindBy(name = "loan_application[automobile][vin]")
    public WebElement vinNum;

    @FindBy(name = "loan_application[automobile][year]")
    public WebElement vehicleYear;

    @FindBy(name = "loan_application[automobile][make]")
    public WebElement vehicleMake;

    @FindBy(name = "loan_application[automobile][model]")
    public WebElement vehicleModel;

    @FindBy(name = "loan_application[automobile][style]")
    public WebElement vehicleTrim;

    @FindBy(name = "loan_application[automobile][history]")
    public WebElement vehicleHist;

    @FindBy(name = "loan_application[automobile][mileage]")
    public WebElement vehicleMileage;

    @FindBy(xpath = "//p[@class='pull-left user-validation-remove']")
    public WebElement scrollD;

    @FindBy(className = "user-email")
    public WebElement email;

    @FindBy(name = "user[heard_about_us]")
    public WebElement selectDD;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    public WebElement captcha;

    @FindBy(xpath = "//button[@class='profile-next-button primary-button-with-arrow pull-right next-button hidden-xs one-click-disable']")
    public WebElement nextEducBtn;

    @FindBy(name = "loan_application[educations][][country]")
    public WebElement selectCountry;

    @FindBy(xpath = "//input[@class='form-control autocomplete-input']")
    public WebElement schoolName;

    @FindBy(name = "loan_application[educations][][status]")
    public WebElement schoolStatus;

    @FindBy(name = "loan_application[educations][][start_date]")
    public WebElement schoolStartDate;

    @FindBy(id = "degree_type_undefined")
    public WebElement degreeType;

    @FindBy(name = "loan_application[educations][][email]")
    public WebElement schoolEmail;

    @FindBy(name = "loan_application[educations][][field_of_study]")
    public WebElement major;

    @FindBy(className = "button-transclude")
    public WebElement nextEmpBtn;
}
