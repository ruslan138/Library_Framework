package com.library.step_definitions;

import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Librarian_Column_Step {

    @Then("the librarian should be able see the following column names:")
    public void the_librarian_should_be_able_see_the_following_column_names(List<String> expected) throws InterruptedException {


        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(),3,"//tr//th");

        List<WebElement> actual1= Driver.getDriver().findElements(By.xpath("//tr//th"));

       List<String> actual=  BrowserUtilities.getElementText(actual1);



        Assert.assertEquals(actual, expected);

        Driver.closeDriver();
    }
}
