package com.noorteck.qa.pages2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;
public class FlightsPage extends CommonUI {

	@FindBy (xpath= "//a[contains(text(),'Flights')]")
	WebElement flightButton;

	@FindBy(xpath= "//input[@value='oneway']")
	WebElement oneWRadio;

	@FindBy(xpath= "//input[@value='roundtrip']")
	WebElement roundwayRadio;
	

	@FindBy(xpath= "//select[@name='passCount']")
	WebElement passengerDropdown;
	//
	@FindBy(xpath="//select[@name='toPort']")
	WebElement arrvingInDropdow;

	@FindBy(xpath= "//select[@name='toMonth']")
	WebElement re_monthDropdown;

	@FindBy(xpath= "//select[@name='toDay']")
	WebElement re_dayDropdown;

	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departingDropdow;

	@FindBy(xpath= "//select[@name='fromMonth']")
	WebElement monthDropdown;

	@FindBy(xpath= "//select[@name='fromDay']")
	WebElement dayDropdown;

	@FindBy(xpath= "//input[@value='First']")
	WebElement firstclassRadio;

	@FindBy(xpath= "//input[@value='Business']")
	WebElement businessRadio;

	@FindBy(xpath= "//input[@value='Coach']")
	WebElement economyRadio;
	//select[@name='airline']
	@FindBy(xpath= "//select[@name='airline']")
	WebElement arilineDropdown;

	@FindBy (xpath= "//input[@name='findFlights']")
	WebElement continueButton;

	@FindBy (xpath= "//tbody/tr[1]/td[1]/p[1]/font[1]")
	WebElement displayFlightMessage;

	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickFlight() {
		click(flightButton);
	}
	public void clickOneRadio() {
		click(oneWRadio);
	}
	public void clickRoundRadio() {
		click(roundwayRadio);
		System.out.println();
	}
	public void enterPassenger(String methodName, String IndexTextValue) {
		selectFromDropdown(passengerDropdown, methodName, IndexTextValue);
	}
	public void enterdepartingFrom(String methodName, String IndexTextValue) {
		selectFromDropdown(departingDropdow, methodName, IndexTextValue);
	}
	public void enterArravingIn(String methodName, String IndexTextValue) {
		selectFromDropdown(arilineDropdown, methodName, IndexTextValue);
	}	
	public void enterMonth(String methodName, String IndexTextValue) {
		selectFromDropdown(monthDropdown, methodName, IndexTextValue);
	}
	public void enterre_Month(String methodName, String IndexTextValue) {
		selectFromDropdown(re_monthDropdown, methodName, IndexTextValue);
	}
	public void enterDay(String methodName, String IndexTextValue) {
		selectFromDropdown(dayDropdown, methodName, IndexTextValue);
	}
	public void enterre_Day(String methodName, String IndexTextValue) {
		selectFromDropdown(re_dayDropdown, methodName, IndexTextValue);
	}
	public void clickfirstClass() {
		click(firstclassRadio);
	}
	public void clickbusinessRadio() {
		click(businessRadio);
	}
	public void clickEconomyRadio() {
		click(economyRadio);
		System.out.println();
	}	
	public void clickContinue() {
		click(continueButton);
	}
	public void enterAirline(String methodName, String IndexTextValue) {
		selectFromDropdown(arilineDropdown, methodName, IndexTextValue);
	}
	public String displayMessage() {
		return getText(displayFlightMessage);  
	}

}
