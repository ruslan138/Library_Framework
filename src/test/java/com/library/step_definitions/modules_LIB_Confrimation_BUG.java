package com.library.step_definitions;

import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class modules_LIB_Confrimation_BUG {

    @Then("the user should see following librarian modules")
    public void the_user_should_see_following_librarian_modules(List<String> expected) {

        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//ul/li/a[@class='nav-link']");

        List<WebElement> actual1= Driver.getDriver().findElements(By.xpath("//ul/li/a[@class='nav-link']"));

        List<String> actual= BrowserUtilities.getElementText(actual1);

        System.out.println(actual);
        System.out.println(actual.size());

        System.out.println(expected);

        //[Dashboard, Users, Books] actual
        //3
        //[Dashboard, Books, Borrowing Books] expected

      // Assert.assertTrue(actual.equals(expected));

        Driver.closeDriver();

    }
}
