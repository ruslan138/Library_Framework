package com.library.step_definitions;

import com.library.pages.LandingPage;
import com.library.pages.Login;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class studentsColumn_stepDefinitiosn_BUG {
    LandingPage landingPage = new LandingPage();
    Login login = new Login();


    @Then("the user should be see the following column names:")
    public void the_user_should_be_see_the_following_column_names(List<String> expected) {
        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),3,"//tr//th");



        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),3,"//tr[@role='row']//th");

        System.out.println(expected.size());
        System.out.println(expected);

        List<WebElement> columns = Driver.getDriver().findElements(By.xpath("//tr[@role='row']//th"));

        List<String> actual = BrowserUtilities.getElementText(columns);

        Assert.assertTrue(actual.equals(expected));

Driver.closeDriver();

    }
}
