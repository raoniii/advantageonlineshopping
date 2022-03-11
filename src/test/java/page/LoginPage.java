package page;

import org.openqa.selenium.By;

public class LoginPage {

	// botao user
	private By user = By.xpath("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]/a[1]/*[name()='svg'][1]");

	private By userField = By.xpath("//sec-view[1]/div/input");
	private By passWordField = By.xpath("//sec-view[2]/div/input");

	private By buttonSignIn = By.xpath("//*[@id=\"sign_in_btnundefined\"]");

	private By messageLogin = By.id("signInResultMessage");
	private By byRedirecionaLogin = By.id("menuUser");

	public By getUserField() {
		return userField;
	}

	public By getPassWordField() {
		return passWordField;
	}

	public By getButtonUser() {
		return user;
	}

	public By getButtonSignIn() {
		return buttonSignIn;
	}

	public By getMessageLogin() {
		return messageLogin;
	}

	public By getByRedirecionaLogin() {
		return byRedirecionaLogin;
	}
}