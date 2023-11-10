package com.crm.library.step_definitions;

import com.crm.library.pages.LoginPage;
import com.crm.library.utilities.ConfigurationReader;
import com.crm.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }
    @When("user login as a librarian")
    public void user_login_as_a_librarian() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        loginPage.signInButton.click();
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected= "dashboard";
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));
    }

    @When("user login as a student")
    public void userLoginAsAStudent() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("student95_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("student95_pass"));
        loginPage.signInButton.click();
    }

    @Then("books should be displayed")
    public void booksShouldBeDisplayed() {
        String expected= "books";
        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));
    }
}
