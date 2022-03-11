package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import logic.LoginLogic;

public class LoginSteps {

	private LoginLogic loginLogic;

	public LoginSteps() {
		loginLogic = new LoginLogic();
	}

	@Given("abrir site {string}")
	public void abrirSite(String userName) {
		loginLogic.home(userName);
		LoginLogic.threadSleep(5000);

	}

	@Given("clicar no botao user")
	public void clicarBotaoUser() {

		loginLogic.clickButtonUser();

	}
	
	@Then("^insiro meu usuario\"([^\"]*)\"$")
	public void insiro_meu_usuario(String username) {
		
		loginLogic.writeLogin(username);
	}
	

	@Then("^insiro minha senha \"([^\"]*)\"$")
	public void insiro_minha_senha(String password) {
		loginLogic.writePassWord(password);
		LoginLogic.threadSleep(22000);
	}
	
	@Given("clicar no botao signin")
	public void clicarBotaoSign() {

		loginLogic.clickButtonSign();
	}
	
	


}