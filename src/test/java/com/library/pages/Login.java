package com.library.pages;

import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login { public Login(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "//*[@id='inputEmail']")
    public WebElement userName;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUser;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordForNewUSer;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailForNewUSer;

    @FindBy(xpath = "//textarea")
    public WebElement addAdress;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChanges;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr[1]/td[1]")
    public WebElement editUser;

}
