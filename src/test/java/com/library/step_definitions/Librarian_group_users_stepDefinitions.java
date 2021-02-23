package com.library.step_definitions;

import com.library.pages.LandingPage;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Librarian_group_users_stepDefinitions {
    LandingPage landingPage = new LandingPage();




    @And("sort {string}")
    public void sort(String name) {
        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),4,"//span[.='Users']");
        landingPage.userButton.click();
        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//select[@id='user_groups']");

        Select select =new Select(Driver.getDriver().findElement(By.id("user_groups")));

        select.selectByVisibleText(name);
        String actual= select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, name);
        Driver.closeDriver();
    }


}
