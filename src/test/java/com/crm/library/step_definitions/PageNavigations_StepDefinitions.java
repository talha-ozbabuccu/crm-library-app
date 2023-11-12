package com.crm.library.step_definitions;

import com.crm.library.pages.LandingPage;
import com.crm.library.pages.UsersPage;
import com.crm.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PageNavigations_StepDefinitions {

    LandingPage landingPage=new LandingPage();
    UsersPage usersPage=new UsersPage();
    Select select;
    @When("user click on {string} link")
    public void user_click_on_link(String link) {
        switch (link.toLowerCase()){
            case "dashboard":
                landingPage.dashboardPageLink.click();
                break;
            case "users":
                landingPage.userPageLink.click();
                break;
            case "books":
                landingPage.booksPageLink.click();
                break;
        }
    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer expected) {
        select=new Select(usersPage.showRecordsDropdown);
        String actual=select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected+"",actual);
    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String>options) {
//        System.out.println("options.size() = " + options.size());
//        System.out.println("options = " + options);
        select=new Select(usersPage.showRecordsDropdown);
        List<WebElement>webElements=select.getOptions();
        List<String>actualTexts=BrowserUtils.getElementsText(webElements);
        Assert.assertEquals(options,actualTexts);
    }


}

