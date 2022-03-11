package page;



import org.openqa.selenium.By;

public class ProductRemovePage {
	
	private final By btnCart = By.id("menuCart");
	
	
	private final By byBtnRemove = By.xpath("/html[1]/body[1]/div[3]/section[1]/article[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/a[3]");
	
	
	
	
	public By getByBtnRemove() {
		return byBtnRemove;
	}
	
	public By getBtnCart() {
		return btnCart;
	}

	

}
