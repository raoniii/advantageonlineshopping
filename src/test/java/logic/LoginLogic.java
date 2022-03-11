package logic;

import org.openqa.selenium.By;

import elementos.Elementos;
import page.LoginPage;



public class LoginLogic extends Elementos {

	private LoginPage loginPage;

	public LoginLogic() {
		loginPage = new LoginPage();
	}

	public void writeUser(String user) {
		clickHim(loginPage.getByRedirecionaLogin());
		clearAndWrite(loginPage.getUserField(), user);
	}
	public void writeLogin(String userName) {



		clearAndWrite(loginPage.getUserField(), userName);
		}

	public void clickButtonUser() {
		clickHim(loginPage.getButtonUser());

		threadSleep(3000);

	}

	public void clickButtonSign() {
		clickHim(loginPage.getButtonSignIn());
	}

			

	public void writePassWord(String password) {
		clearAndWrite(loginPage.getPassWordField(), password);
	}

	public static void clearAndWrite(By field, String txt) {
		if (findingElement(field).isDisplayed()) {
			waitClickable(field);
			findingElement(field).clear();
			findingElement(field).sendKeys(txt);
		}
	}
	

}
