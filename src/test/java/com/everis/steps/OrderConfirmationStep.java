package com.everis.steps;

import com.everis.pages.OrderConfirmationPage;
import io.cucumber.java.pt.E;
import org.junit.Assert;

public class OrderConfirmationStep {

    @E("^deve ser apresentado a mensagem Your order on My Store is complete.$")
    public void deveSerApresentadoAMensagemYourOrderOnMyStoreIsComplete(){
        OrderConfirmationPage orderConfirmationPage= new OrderConfirmationPage();
        Assert.assertEquals("Your order on My Store is complete.", orderConfirmationPage.mensagemDeConfimação());
    }
}
