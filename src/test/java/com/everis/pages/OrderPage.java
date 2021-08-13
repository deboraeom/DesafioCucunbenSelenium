package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OrderPage extends BasePage{

    @FindBy(css = "#center_column > form > p > button")
    protected WebElement confirmaEndereço;

    public OrderPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void confirmarendereço() {
        confirmaEndereço.click();
        log("Endereço confirmado ");
    }
}
