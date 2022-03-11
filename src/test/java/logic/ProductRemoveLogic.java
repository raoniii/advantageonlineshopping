package logic;

import elementos.Elementos;
import page.ProductRemovePage;


public class ProductRemoveLogic extends Elementos {
	
	private ProductRemovePage productremovePage;
	
	public ProductRemoveLogic() {
		
		productremovePage = new ProductRemovePage();
		
	}
	
	public void ClickOnCart() {
		clickHim(productremovePage.getBtnCart());
		threadSleep(1000);

	}
	
	
	public void ClickRemove() {
		clickHim(productremovePage.getByBtnRemove());
		threadSleep(3000);
	}
	

}
