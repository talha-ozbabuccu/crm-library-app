package com.crm.library.pages;

import com.crm.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;
    @FindBy(id = "inputPassword")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;
}
