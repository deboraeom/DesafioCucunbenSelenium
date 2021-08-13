package com.everis.steps;

import com.everis.pages.SearchResultPage;

import io.cucumber.java.pt.E;

public class SearchResultSteps {

	@E("^adiciona o produto \"(.*)\" ao carrinho$")
	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		SearchResultPage searchResultPage = new SearchResultPage();
		searchResultPage.adicionarProdutoAoCarrinho(nomeProduto);
	}
	
}