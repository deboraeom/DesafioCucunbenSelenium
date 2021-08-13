package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.concurrent.ScheduledExecutorService;

public class OrderShippingPage extends BasePage{
    @FindBy(id="cgv")
    protected WebElement ckeckBox;

    @FindBy(name ="processCarrier" )
    protected WebElement confirmaTranspote;




    public OrderShippingPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }
    public void escolheFormaDeTransporte() {
        ckeckBox.click();
        confirmaTranspote.click();
        log("Transporte confimado");

    }
}
