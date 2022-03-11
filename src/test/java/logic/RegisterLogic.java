package logic;



import elementos.Elementos;
import page.RegisterPage;



public class RegisterLogic extends Elementos {

    private RegisterPage registerPage;

    public RegisterLogic(){
        registerPage = new RegisterPage();
    }

    public void clickCreateNewAccount(){
       threadSleep(2000);
       clickHim(registerPage.getLinkCreateAccount());
    }

    public void writeUser(String user){
        clickHim(registerPage.getUserNameField());
        clearAndWrite(registerPage.getUserNameField(), user);
    }

    public void writeEmail(String email){
        clickHim(registerPage.getEmailField());
        clearAndWrite(registerPage.getEmailField(),email);
    }

    public void writePassoword(String password){
        clickHim(registerPage.getPasswordField());
        clearAndWrite(registerPage.getPasswordField(),password);
    }

    public void writeConfirmPassword(String confirmPassword){
        clickHim(registerPage.getConfirmPassowrdField());
        clearAndWrite(registerPage.getConfirmPassowrdField(), confirmPassword);
    }

    public void writeFirstName(String firstName){
        clickHim(registerPage.getFirstNameField());
        clearAndWrite(registerPage.getFirstNameField(), firstName);
    }

    public void writeLastName (String lastName){
        clickHim(registerPage.getLastNameField());
        clearAndWrite(registerPage.getLastNameField(), lastName);
    }

    public void writePhoneNumber(String phoneNumber){
        clickHim(registerPage.getPhoneNumberField());
        clearAndWrite(registerPage.getPhoneNumberField(), phoneNumber);
    }

    public void selectCountry(String country){
        clickHim(registerPage.getCountryComboBox());
        threadSleep(3000);
        selectComboBox(registerPage.getCountryComboBox(), country);
    }
    public void writeCity(String city){
        clickHim(registerPage.getCityField());
        clearAndWrite(registerPage.getCityField(),city);
    }
    public void writeAddress(String address){
        clickHim(registerPage.getAddressField());
        clearAndWrite(registerPage.getAddressField(), address);
    }

    public void writeState(String state){
        clickHim(registerPage.getStateField());
        clearAndWrite(registerPage.getStateField(), state);
    }

    public void writePostalCode(String postalCode){
        clickHim(registerPage.getPostalCodeField());
        clearAndWrite(registerPage.getPostalCodeField(), postalCode);
    }

    public void selectCheckBoxIAgree(){
        clickHim(registerPage.getIagreeCheckBox());
    }

    public void clickButtonRegister(String user){
        clickHim(registerPage.getButtonRegister());
        threadSleep(3000);
        
    }

	
}
