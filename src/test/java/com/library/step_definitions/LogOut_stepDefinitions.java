package com.library.step_definitions;

import com.library.pages.LandingPage;
import com.library.pages.Login;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LogOut_stepDefinitions {
    Login login =new Login();
    LandingPage landingPage =new LandingPage();
    @When("i login as a user")
    public void i_login_as_a_user() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.userName.sendKeys(ConfigurationReader.getProperty("studentL"));
        login.password.sendKeys(ConfigurationReader.getProperty("studentP"));
        login.submit.click();
    }

    @Then("i should be able to logout")
    public void i_should_be_able_to_logout() {
        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),3,"//a[@class='nav-link dropdown-toggle']//span");

        landingPage.clicktoLogin.click();
        landingPage.logOut.click();
    }

    @Then("return to the login page")
    public void return_to_the_login_page()  {

        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//label[@for='inputEmail']");
        String expected ="http://library2.cybertekschool.com/login.html";

        String actual =Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expected, actual);
    }
}
