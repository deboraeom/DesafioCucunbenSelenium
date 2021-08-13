package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage{

    @FindBy(css = "#center_column > div > p > strong")
    protected WebElement message;



    public OrderConfirmationPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public String  mensagemDeConfimação() {

        String mensagem = message.getText();
        log("fim");
        return mensagem ;

    }
}
