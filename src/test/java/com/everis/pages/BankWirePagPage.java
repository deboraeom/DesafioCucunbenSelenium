package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankWirePagPage extends BasePage{



    @FindBy(css = "#cart_navigation > button")
    protected WebElement submitButton;

    public BankWirePagPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void confirmaPedido() {
        submitButton.click();
    }
}
