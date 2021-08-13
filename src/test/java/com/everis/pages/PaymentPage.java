package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage{


    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
    protected WebElement submitButton;

    public PaymentPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }
    public void selecionaPagamento() {
        submitButton.click();
        log("Pagamento selecionado");
    }
}
