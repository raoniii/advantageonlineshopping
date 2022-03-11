package page;


import org.openqa.selenium.By;

public class ProductInsertPage {

	private final By selectCategory = By.xpath("/html[1]/body[1]/div[3]/section[1]/article[1]/div[2]/div[1]/div[2]");

    private final By selectProduct = By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li[1]/img");

	private final By addToCart = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[4]/button");
	

	private final By btnCheckout = By.xpath("//*[@id=\"checkOutPopUp\"]");
	
	public By getSelectCategory() {
		return selectCategory;
	}

	public By getSelectProduct() {
		return selectProduct;
	}

	public By getAddToCart() {
		return addToCart;
	}

	public By getBtnCheckout() {
		return btnCheckout;
	}

	
 
}
