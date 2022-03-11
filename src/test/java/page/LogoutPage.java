package page;

import org.openqa.selenium.By;

public class LogoutPage {


//	private By byRedirecionaLogout = By.xpath("//sec-view[1]/div/input");
	private By byRedirecionaLogout = By.name("menuUserLink");
	
	public By getByRedirecionaLogout() {
		return byRedirecionaLogout;
	}	
	

}
