package com.cucumber.ukvisainfo;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;

public class UKVisaInfoStepDefinitions {
	
	@Steps
	PersonSteps person;
	
	@Managed(driver = "chrome")                                                           
	 WebDriver driver;
	
	@Before
    @Screenshots(forEachAction=true)
	public void openTheApplication() {
		person.open_home_page();
	}
	
	@Given("^I provide a nationality of (.*)$")
    @Screenshots(forEachAction=true)
	public void personProvideNationality(String countryname) {
		
		person.provide_nationality_of(countryname);	
////		conn.selectFromDropDown(countryname);
////		conn.click("nextStep_xpath");

		}
	
	
//	
	@And("^I select the reason (.*)$")
    @Screenshots(forEachAction=true)
	public void personSelectReasonOfStay(String reason) {
		
		person.select_reason_of(reason);
//		conn.selectFromRadioButton("ukVisaReasonRadioButtons_xpath", reason);
//		conn.click("nextStep_xpath");
		System.out.println("click");
	}
	
	@And("^I state I am intending to stay for (.*)$")
    @Screenshots(forEachAction=true)
	public void personSelectDurationOfStay(String duration) {
		
		person.select_intend_to_stay_for(duration);
//		conn.selectFromRadioButton("ukVisaDurationRadioButtons_xpath", duration);
//		conn.click("nextStep_xpath");
	}
	
	@When("^I submit the form$")
    @Screenshots(forEachAction=true)
	public void personSubmitForm() {
		
		person.submit_the_form();
		}
	
	@Then("^I will be informed that (.*)$")
    @Screenshots(forEachAction=true)
	public void visaInformationMessage(String message) 	{	
		person.get_message_that(message);
//		conn.validateMessage("visaInformationMessage_xpath",message);
	}
//	
	@And("^I state (.*) I am not travelling or visiting a partner or family$")
    @Screenshots(forEachAction=true)
	public void personSelectYesOrNo(String answer) {
		
		person.state_not_travelling_or_visiting_partner_or_family(answer);
////		System.out.println(answer+ " I am not travelling or visiting a partner or family");
////		conn.selectFromRadioButton("RadioButtons_xpath", answer);
////		conn.click("nextStep_xpath");
	}

	}
