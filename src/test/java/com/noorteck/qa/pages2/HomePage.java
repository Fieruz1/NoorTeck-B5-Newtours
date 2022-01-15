package com.noorteck.qa.pages2;

import org.openqa.selenium.WebElement;
/**
 * 
 *Fieruz
 */

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;
//Homepage class
public class HomePage extends CommonUI{
	//1 register
	@FindBy (xpath= "//a[contains(text(),'REGISTER')]")
	WebElement registerButton;
	//2 signon
	@FindBy(xpath= "//a[contains(text(),'SIGN-ON')]")
	WebElement signOnButton;
	//3 flight
	@FindBy (xpath= "//a[contains(text(),'Flights')]")
	WebElement flightButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickRegister() {
		click(registerButton);	
	}
	public void clickSignOn() {
		click(signOnButton);
	}
	public void clickFlight() {
		click(flightButton);
	}
}


