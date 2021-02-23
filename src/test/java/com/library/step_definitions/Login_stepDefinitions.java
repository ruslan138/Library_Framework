package com.library.step_definitions;

import com.library.pages.Login;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDefinitions {

 Login login =new Login();

    @When("User login as a {string}")
    public void user_login_as_a(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       if(role.equals("librarian")){

           login.userName.sendKeys(ConfigurationReader.getProperty("librarianL"));
           login.password.sendKeys(ConfigurationReader.getProperty("librarianP"));


       }else{
           login.userName.sendKeys(ConfigurationReader.getProperty("studentL"));
           login.password.sendKeys(ConfigurationReader.getProperty("studentP"));
       }
        login.submit.click();

    }

    @Then("Then title should contain {string}")
    public void then_title_should_contain(String urlContains) {

        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),3,"//a[@class='nav-link dropdown-toggle']//span");

        String actual = Driver.getDriver().getCurrentUrl();
      BrowserUtilities.urlContains(urlContains);
   Driver.closeDriver();


    }

}