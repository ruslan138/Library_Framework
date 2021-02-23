package com.library.step_definitions;

import com.library.utilities.BrowserUtilities;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class studentSearchBook_StepDefinitions {



    @Then("i could search book by categories and choose a Classic")
    public void iCouldSearchBookByCategoriesAndChooseAClassic() {
        BrowserUtilities.explicitWaitClick(Driver.getDriver(),3,"//select[@id='book_categories']");

        Select select = new Select(Driver.getDriver().findElement(By.id("book_categories")));

        select.selectByVisibleText("Classic");

        String actual =select.getFirstSelectedOption().getText();
        Assert.assertEquals("Classic", actual);

        Driver.closeDriver();
    }
}
