package page;


import org.openqa.selenium.By;

public class RegisterPage {

    private By linkCreateAccount = By.linkText("CREATE NEW ACCOUNT");
    private By userNameField = By.name("usernameRegisterPage");
    private By emailField = By.name("emailRegisterPage");
    private By passwordField = By.name("passwordRegisterPage");
    private By confirmPassowrdField = By.name("confirm_passwordRegisterPage");
    private By firstNameField = By.name("first_nameRegisterPage");
    private By lastNameField = By.name("last_nameRegisterPage");
    private By phoneNumberField = By.name("phone_numberRegisterPage");
    private By cityField = By.name("cityRegisterPage");
    private By addressField = By.name("addressRegisterPage");
    private By stateField = By.name("state_/_province_/_regionRegisterPage");
    private By postalCodeField = By.name("postal_codeRegisterPage");
    private By countryComboBox = By.name("countryListboxRegisterPage");
    private By iagreeCheckBox = By.name("i_agree");
    private By buttonRegister = By.id("register_btnundefined");


    public By getLinkCreateAccount(){
        return linkCreateAccount;
    }
    public By getUserNameField(){
        return  userNameField;
    }
    public By getEmailField(){
        return emailField;
    }
    public By getPasswordField(){
        return passwordField;
    }
    public By getConfirmPassowrdField(){
        return confirmPassowrdField;
    }
    public By getFirstNameField(){
        return firstNameField;
    }
    public By getLastNameField(){
        return lastNameField;
    }
    public By getPhoneNumberField(){
        return phoneNumberField;
    }
    public By getCityField(){
        return cityField;
    }
    public By getAddressField(){
        return addressField;
    }
    public By getStateField(){
        return stateField;
    }
    public By getPostalCodeField(){
        return postalCodeField;
    }
    public By getCountryComboBox(){
        return countryComboBox;
    }
    public By getIagreeCheckBox(){
        return iagreeCheckBox;
    }
    public By getButtonRegister(){
        return buttonRegister;
    }
}