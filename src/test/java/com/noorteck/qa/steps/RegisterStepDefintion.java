package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefintion extends CommonUI{
	
	String url = "https://demo.guru99.com/test/newtours/register_sucess.php";
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
	   System.out.println("User register");
	   CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
	}

	@When("User enters firstname")
	public void user_enters_firstname() {
		   System.out.println("User enter first name");
	}

	@When("User enters lastname")
	public void user_enters_lastname() {
		   System.out.println("User lastname");
	}

	@When("User enters phone")
	public void user_enters_phone() {
		   System.out.println("User enters phone");
	}

	@When("User enters email")
	public void user_enters_email() {
		 System.out.println("User enters email");
	}

	@When("User enters Address")
	public void user_enters_address() {
	     System.out.println("User enters address");
	}

	@When("User enters city")
	public void user_enters_city() {
		 System.out.println("User enters city");
	}

	@When("User enters state")
	public void user_enters_state() {
		 System.out.println("User enters state");
	}

	@When("User enters zipcode")
	public void user_enters_zipcode() {
		 System.out.println("User enters zipcode");
	}

	@When("User chose country from dropdown")
	public void user_chose_country_from_dropdown() {
		 System.out.println("User chose country from dropdown");
	}

	@When("User enters User name")
	public void user_enters_user_name() {
		 System.out.println("User enters User name");
	}

	@When("User enters password")
	public void user_enters_password() {
		 System.out.println("User enters password");
	}

	@When("User enters confirm password")
	public void user_enters_confirm_password() {
		 System.out.println("User enters confirm password");
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
	    System.out.println("User click submit button");
	}

	@Then("verify Thank you for registering message")
	public void verify_thank_you_for_registering_message() {
		 System.out.println("Message Thank you for registring");
		 System.out.println(CommonUI.getTitle());
			CommonUI.quitBrowser();
	}


}
