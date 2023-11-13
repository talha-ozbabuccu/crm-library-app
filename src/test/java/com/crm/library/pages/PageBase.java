package com.crm.library.pages;

import com.crm.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText = "Users")
    public WebElement userPageLink;
    @FindBy(linkText = "Books")
    public WebElement booksPageLink;
    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;
    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement accountUsername;

}
