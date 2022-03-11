package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import logic.LogoutLogic;

public class LogoutSteps {

	private LogoutLogic logoutLogic;

	public LogoutSteps() {
		logoutLogic = new LogoutLogic();
	}
	
	@And("^clico para sair \"([^\"]*)\"$")
	public void clickparasair() {
		logoutLogic.clickButtonField();

	}
	

	@Then("^clico em SignOut \"([^\"]*)\"$")
	public void clickbotaosair(String password) {

	}

	@Then("^Valido se a conta foi deslogada \"([^\"]*)\"$")
	public void validarlogout(String password) {

	}

}
