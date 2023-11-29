package com.crm.library.step_definitions;

import com.crm.library.pages.LandingPage;
import com.crm.library.pages.LoginPage;
import com.crm.library.utilities.ConfigurationReader;
import com.crm.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    LandingPage landingPage=new LandingPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

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

        wait.until(ExpectedConditions.urlContains(expected));

        String actual=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));
        Driver.closeDriver();
    }


    @And("click the sign in button")
    public void clickTheSignInButton() {
        loginPage.signInButton.click();
    }

    @And("there should be {int} users")
    public void thereShouldBeUsers(Integer int1) {
        int expectedUserNumber=int1;
        String expected= String.valueOf(expectedUserNumber);

        wait.until(ExpectedConditions.invisibilityOf(landingPage.userCount));
        String actual= landingPage.userCount.getText();

        Assert.assertEquals("Actual user number is not as expected!",expected,actual);
    }

    @When("user enters username {string}")
    public void userEntersUsername(String string) {
        loginPage.usernameInput.sendKeys(string);
    }

    @And("user enter password {string}")
    public void userEnterPasswordIFFPPf(String string) {
        loginPage.passwordInput.sendKeys(string);
    }

    @When("user enters username {string} and enters password {string}")
    public void userEntersUsernameAndEnterPasswordAOYKYTMJ(String str1,String str2) {
        loginPage.usernameInput.sendKeys(str1);
        loginPage.passwordInput.sendKeys(str2);
        loginPage.signInButton.click();
    }

    @When("user login using {string} and {string}")
    public void userLoginUsingAnd(String arg0, String arg1) {

    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String expectedaccountUsername) {
        String actualAccountusername=landingPage.accountUsername.getText();
        Assert.assertEquals("Account username is not as expeceted!",expectedaccountUsername,actualAccountusername);
        Driver.closeDriver();

    }
}
