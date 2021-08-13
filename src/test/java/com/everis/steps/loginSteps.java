package com.everis.steps;

import com.everis.pages.CarrinhoPage;
import com.everis.pages.LoginPage;
import io.cucumber.java.pt.E;

public class loginSteps {

    @E("^realiza login \"(.*)\" e senha \"(.*)\"$")
    public void realizaLogin(String email, String senha) {
        LoginPage loginPage = new LoginPage();
        loginPage.fazLogin(email, senha);
    }
}
