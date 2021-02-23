package com.library.step_definitions;

import com.library.pages.LandingPage;
import com.library.pages.Login;
import com.library.pages.UserPage;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class librarian_showFiles_stepDefinitions {
Login login = new Login();
LandingPage landingPage = new LandingPage();
UserPage userPage =new UserPage();


    @Then("I click on Users link")
    public void i_click_on_users_link() {
        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//span[.='Users']");
        landingPage.userButton.click();
    }



    @And("show records should have following {string}")
    public void showRecordsShouldHaveFollowing(String variant) {
        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//select[@name='tbl_users_length']");
        Select select = new Select(Driver.getDriver().findElement(By.name("tbl_users_length")));

        select.selectByVisibleText(variant);

        String actual=select.getFirstSelectedOption().getText();

        Assert.assertTrue(actual.equals(variant));

        Driver.closeDriver();
    }

    @Then("show records default value should be {string}")
    public void showRecordsDefaultValueShouldBe(String arg0) throws InterruptedException {
        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),3,"//select[@name='tbl_users_length']");
        Select select = new Select(Driver.getDriver().findElement(By.name("tbl_users_length")));



       String actual=  select.getFirstSelectedOption().getText();

        Assert.assertTrue(actual.equals(arg0));


        System.out.println(select.getFirstSelectedOption().getText());




        System.out.println("select.getAllSelectedOptions().size() = " + select.getAllSelectedOptions().size());


    }
}
