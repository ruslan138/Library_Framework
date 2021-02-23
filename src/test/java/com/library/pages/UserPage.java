package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserPage {
    public UserPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement showsButton;

    @FindBy(xpath = "//span[@class='title']")
    public List<WebElement> studentLinks;


    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUser;


}
