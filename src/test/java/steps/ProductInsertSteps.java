package steps;

import io.cucumber.java.en.When;
import logic.ProductInsertLogic;

public class ProductInsertSteps {
	
	private ProductInsertLogic productinsertLogic;
	
	public ProductInsertSteps() {
		productinsertLogic = new ProductInsertLogic();
	}
	
	@When("seleciona categoria")
	public void carregaTelaDeProdutos() {
		
		productinsertLogic.SelectCategory();
	   
	}
		
	@When("seleciono um produto")
	public void selecionoUmProduto() {

		productinsertLogic.SelectProduct();
	}
	
	@When("adcionar produto")
	public void adcionarProduto() {
		
		productinsertLogic.AddProduct();

	}


}
