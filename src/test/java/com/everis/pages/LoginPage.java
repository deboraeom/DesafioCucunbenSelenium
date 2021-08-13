package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id="email")
    protected WebElement login;

    @FindBy(css = "#passwd")
    protected WebElement password;

    @FindBy(css = "#SubmitLogin")
    protected WebElement submitButton;

    public LoginPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }



    public void fazLogin(String email, String senha) {
        login.sendKeys(email);
        password.sendKeys(senha);
        submitButton.click();
        log("Logado ");
    }
}
