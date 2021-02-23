package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public LandingPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(id = "userCount")
    public WebElement userCount;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userButton;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksButton;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']//span")
    public WebElement clicktoLogin;

    @FindBy(xpath = "//div[@class='dropdown-menu show']")
    public WebElement logOut;


    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowingBooks;
}
