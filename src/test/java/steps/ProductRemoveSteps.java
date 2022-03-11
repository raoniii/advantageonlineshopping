package steps;

import io.cucumber.java.en.Then;
import logic.ProductRemoveLogic;

public class ProductRemoveSteps {

	private ProductRemoveLogic productremoveLogic;

	public ProductRemoveSteps() {

		productremoveLogic = new ProductRemoveLogic();

	}

	@Then("clicar no carrinho")
	public void clicarNoCarrinho() {

		productremoveLogic.ClickOnCart();

	}

	@Then("Clicar em remover")
	public void clicarEmRemover() {
		productremoveLogic.ClickRemove();
	}

}
