package com.weborders.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {
    @FindBy (id = "ct100_MainContent_username")
    private WebDriver userName;

}
