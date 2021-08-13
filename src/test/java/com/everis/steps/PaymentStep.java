package com.everis.steps;

import com.everis.pages.BankWirePagPage;
import com.everis.pages.PaymentPage;
import io.cucumber.java.pt.E;

public class PaymentStep {

    @E("^pagamento for confirmado$")
    public void pagamenoForConfirmado(){
        PaymentPage paymentPage= new PaymentPage();
        paymentPage.selecionaPagamento();
        BankWirePagPage bankWirePagPage= new BankWirePagPage();
        bankWirePagPage.confirmaPedido();

    }
}
