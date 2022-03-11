package steps;

import logic.RegisterLogic;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;

public class RegisterSteps {

	private RegisterLogic registerLogic;

	public RegisterSteps() {
		registerLogic = new RegisterLogic();

	}

	@Then("^inserir usuario \"([^\"]*)\"$")
	public void insiro_meu_usuario(String user) {
		registerLogic.abrirNavegador(user);

		registerLogic.writeUser(user);
	}

	@Then("^inserir Email \"([^\"]*)\"$")
	public void insiro_meu_Email(String email) {
		registerLogic.writeEmail(email);
	}

	@Then("^inserir senha \"([^\"]*)\"$")
	public void insiro_minha_senha(String password) {
		registerLogic.writePassoword(password);
	}

	@Then("^insesir confirmacao da senha \"([^\"]*)\"$")
	public void insiro_a_confirmacao_da_minha_senha(String confirmPassword) {
		registerLogic.writeConfirmPassword(confirmPassword);
	}

	@Then("^insesir primeiro nome \"([^\"]*)\"$")
	public void insiro_meu_primeiro_nome(String firstName) {
		registerLogic.writeFirstName(firstName);
	}

	@Then("^insesir sobrenome \"([^\"]*)\"$")
	public void insiro_meu_sobrenome(String lastName) {
		registerLogic.writeLastName(lastName);
	}

	@Then("^insesir telefone \"([^\"]*)\"$")
	public void insiro_meu_numero_de_telefone(String phoneNumber) {
		registerLogic.writePhoneNumber(phoneNumber);
	}

	@Then("^selecionar pais \"([^\"]*)\"$")
	public void seleciono_o_pais(String country) {
		registerLogic.selectCountry(country);
	}

	@Then("^insesir Cidade \"([^\"]*)\"$")
	public void insiro_a_Cidade(String city) {
		registerLogic.writeCity(city);
	}

	@Then("^insesir Endereco \"([^\"]*)\"$")
	public void insiro_o_Endereco(String address) {
		registerLogic.writeAddress(address);
	}

	@Then("^insesir Estado \"([^\"]*)\"$")
	public void insiro_o_Estado(String state) {
		registerLogic.writeState(state);
	}

	@Then("^insesir CEP \"([^\"]*)\"$")
	public void insiro_o_CEP(String postalCode) {
		registerLogic.writePostalCode(postalCode);
	}

	@Then("^clicar em condicoes de privacidade do site$")
	public void clico_no_botao_de_acordo_com_as_condicoes_de_privacidade_do_site() {
		registerLogic.selectCheckBoxIAgree();
	}

	@Then("^clicar no botao registro \"([^\"]*)\"$")
	public void clico_no_botao_de_registro(String user) {
		registerLogic.clickButtonRegister(user);

	}



}
