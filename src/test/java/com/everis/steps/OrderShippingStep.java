package com.everis.steps;

import com.everis.pages.OrderPage;
import com.everis.pages.OrderShippingPage;
import io.cucumber.java.pt.E;

public class OrderShippingStep {

    @E("escolhe a forma de transporte")
    public void escolheAFormaDeTransporte() {
        OrderShippingPage orderShippingPage = new OrderShippingPage();
        orderShippingPage.escolheFormaDeTransporte();

}
}
