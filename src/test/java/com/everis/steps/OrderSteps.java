package com.everis.steps;


import com.everis.pages.OrderPage;
import io.cucumber.java.pt.E;


public class OrderSteps {

    @E("Confirma endereço de entrega")
    public void ConfirmaEndereçoDeEntrega() {
        OrderPage orderPage = new OrderPage();
        orderPage.confirmarendereço();
    }
}
