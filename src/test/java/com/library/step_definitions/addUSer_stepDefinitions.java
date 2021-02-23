package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.LandingPage;
import com.library.pages.Login;
import com.library.pages.UserPage;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class addUSer_stepDefinitions {


    Login login = new Login();
    UserPage userPage = new UserPage();
    LandingPage landingPage = new LandingPage();

    @When("user login as a librarian")
    public void user_login_as_a_librarian() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.userName.sendKeys(ConfigurationReader.getProperty("librarianL"));
        login.password.sendKeys(ConfigurationReader.getProperty("librarianP"));
        login.submit.click();
    }

    @Then("user click on user button")
    public void user_click_on_user_button() {

        landingPage.userButton.click();
    }

    @Then("add new user")
    public void add_new_user() throws InterruptedException {
        Faker faker = new Faker();
        BrowserUtilities.explicitWaitClick(Driver.getDriver(), 3, "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']");
        login.addUser.click();

        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//input[@placeholder='Full Name']");
       login.fullName.sendKeys(faker.address().firstName());
        login.passwordForNewUSer.sendKeys(faker.internet().password());
        login.emailForNewUSer.sendKeys(faker.internet().emailAddress());
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='user_groups']")));
        select.selectByVisibleText("Students");
        login.addAdress.sendKeys(faker.address().fullAddress());

        login.saveChanges.click();

    }

    @And("then librarian shoulbe able change userInfo")
    public void thenLibrarianShoulbeAbleChangeUserInfo() throws InterruptedException {
      BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//table[@id='tbl_users']/tbody/tr[1]/td[1]");
    /*WebElement ok = Driver.getDriver().findElement(By.xpath("//table[@id='tbl_users']/tbody/tr[1]/td[1]"));


    ok.click();

     */

 login.editUser.click();
    BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//button[@type='cancel']");

    login.saveChanges.click();

    /*
   WebElement cancel =Driver.getDriver().findElement(By.xpath("//button[@type='cancel']"));
   cancel.click();


     */

        WebElement user= Driver.getDriver().findElement(By.xpath("//table[@id='tbl_users']/tbody/tr[1]/td[1]"));



        Assert.assertTrue(user.isDisplayed());

        Driver.closeDriver();

    }
}