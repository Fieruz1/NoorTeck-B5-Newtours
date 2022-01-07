package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(xpath= "//input[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath= "//input[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath= "//input[@name='phone']")
	WebElement phoneField;

	@FindBy(id= "userName")
	WebElement emailField;

	@FindBy(name= "address1")
	WebElement addressField;

	@FindBy(name= "city")
	WebElement cityField;

	@FindBy(name= "state")
	WebElement stateNameField;

	@FindBy(name= "postalCode")
	WebElement postalCodeField;

	@FindBy(xpath= "//select[@name='country']")
	WebElement countryDropDown;

	@FindBy(xpath= "//input[@id='email']")
	WebElement userNameField;

	@FindBy(xpath= "//input[@name='password']")
	WebElement passwordField;

	@FindBy(xpath= "//input[@name='confirmPassword']")
	WebElement confirmPasswordField;

	@FindBy(xpath= "//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//font[contains(text(),'Thank you for registering.')]")
	WebElement registerMessage;


	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String name) {
		enter(firstNameField, name);
	}
	public void enterlastName(String name) {
		enter(lastNameField, name);
	}
	public void enterPhoneNo(String phone) {
		enter(firstNameField, phone);
	}
	public void enterEmail(String email) {
		enter(firstNameField, email);
	}
	public void enterAddress(String address) {
		enter(firstNameField, address);
	}
	public void enterCity(String city) {
		enter(firstNameField, city);
	}
	public void enterState(String state) {
		enter(firstNameField, state);
	}
	public void enterPostalCode(String postalcode) {
		enter(firstNameField, postalcode);
	}
	public void countryDropdown(String methodName, String indexTextValue) {
		selectFromDropdown(countryDropDown, methodName, indexTextValue);
	}
	public void enterUserName(String name) {
		enter(userNameField, name);
	}
	public void enterPasswrd(String password) {
		enter(firstNameField, password);
	}
	public void enterConfirmPassword(String confirmP) {
		enter(firstNameField, confirmP);
	}
	public void clickSubmit() {
		click(submitButton);
	}
	public String getRegisterText() {
		return getText(registerMessage);
	}

}