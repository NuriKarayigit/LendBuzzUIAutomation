package com.lendbuzz.pages;

import com.lendbuzz.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//nav[@role='navigation']/div")
    public List<WebElement> modules;


    @FindBy(xpath = "//div[@class=\"footer_text text-size-small\"]/br[1]")
    public WebElement MNLS_ID;

    @FindBy(xpath = "//div[@class='nav1_dropdown w-dropdown'][3]/div[1]/div")
    public WebElement Company;

    @FindBy(xpath = "//div[normalize-space()='100 Summer St, Suite 3150 Boston, MA 02110']")
    public WebElement mailingAddress;


    @FindBy(xpath = "/html/body/div[2]/footer/div/div/div[2]/div[4]/a[6]")
    public WebElement contact;


    }


