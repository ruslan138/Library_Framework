package com.library.step_definitions;

import com.library.pages.UserPage;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class modules_Student_step_definitions {

 UserPage userPage = new UserPage();
    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> text) {


 BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//ul/li/a[@class='nav-link']");

       List<WebElement> actual1= Driver.getDriver().findElements(By.xpath("//ul/li/a[@class='nav-link']"));

       List<String> actual= BrowserUtilities.getElementText(actual1);

        System.out.println(actual);
        System.out.println(actual.size());

        System.out.println(text);

        Assert.assertTrue(actual.equals(text));

        Driver.closeDriver();


    }

}
