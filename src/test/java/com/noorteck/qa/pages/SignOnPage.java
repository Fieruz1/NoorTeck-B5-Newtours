package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI{

	// user name
	@FindBy (name = "userName")
	WebElement userNameField;
	//password
	@FindBy(name= "password")
	WebElement passwordField;
	//submit
	@FindBy(name= "submit")
	WebElement submitButton;
	// success message
	@FindBy (xpath = "//h3[normalize-space()='Login Successfully']")
	WebElement displaySuccess;

	//thanking message
	@FindBy(xpath ="//b[contains(text(),'Thank you for Loggin.')]")
	WebElement displayThankLoginField;

	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String name) {
		enter(userNameField, name);
	}
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	public void clickSubmit() {
		click(submitButton);	
	}
	public String displayedSuccess() {
			return getText(displaySuccess);
	}
	public String displayThank() {
		return getText(displayThankLoginField);
}
}

