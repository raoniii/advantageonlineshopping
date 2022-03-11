package logic;

import elementos.Elementos;
import page.ProductInsertPage;


public class ProductInsertLogic extends Elementos{
	
	private ProductInsertPage productinsertPage;
	
	public ProductInsertLogic() {
		productinsertPage = new ProductInsertPage();
		
	}
	
	public void SelectCategory() {
		clickHim(productinsertPage.getSelectCategory());
		threadSleep(9000);

		
	}
	
	public void SelectProduct() {
		clickHim(productinsertPage.getSelectProduct());
		threadSleep(22000);
	}

	
	public void AddProduct() {
		clickHim(productinsertPage.getAddToCart());
		threadSleep(22000);
	}
	
	
}
