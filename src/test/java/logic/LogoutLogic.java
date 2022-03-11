package logic;

import org.openqa.selenium.JavascriptExecutor;

import elementos.Elementos;
import page.LogoutPage;

public class LogoutLogic extends Elementos {

	private LogoutPage logoutPage;

	public LogoutLogic() {
		logoutPage = new LogoutPage();
	}

	public void clickButtonField() {

		clickHim(logoutPage.getByRedirecionaLogout());

	}

}
