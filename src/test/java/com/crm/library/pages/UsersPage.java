package com.crm.library.pages;

import com.crm.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage {
    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "tbl_users_lenght")
    public WebElement showRecordsDropdown;

    @FindBy(tagName = "th")
    public List<WebElement> tableHeaders;
}
