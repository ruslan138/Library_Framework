package com.library.step_definitions;

import com.library.pages.LandingPage;
import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class borrowingBookandConfimModule_Steps {

    LandingPage landingPage = new LandingPage();



    @When("the user click Borrowing Books module")
    public void the_user_click_borrowing_books_module() {
        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//span[.='Borrowing Books']");
        landingPage.borrowingBooks.click();
    }

    @Then("the user should be see to the following column names:")
    public void the_user_should_be_see_to_the_following_column_names(List<String> expected) {

        BrowserUtilities.explicitWaitVisibility(Driver.getDriver(), 3, "//tr//th");

        List<WebElement> column = Driver.getDriver().findElements(By.xpath("//tr//th"));

        List<String> actual = BrowserUtilities.getElementText(column);

        System.out.println(actual.size());
        System.out.println(actual);

        System.out.println(expected);

        //Actual  [Action, Book Name, Borrowed Date, Planned Return Date, Return Date, Is Returned ?]
     //expected [Action, Book Name, Borrowed Data, Planned Return Data, Return Data, Is Returned]

        Driver.closeDriver();
    }
}
