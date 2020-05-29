package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.webdriver.WebConnector;
import com.google.inject.spi.Element;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JapanStudentVisaSteps {
	
	WebConnector conn;
	
	public JapanStudentVisaSteps(WebConnector conn) {
		this.conn=conn;
	}

	@Before
	public void openTheApplication() {
		
		conn.openBrowser("Mozilla");
		conn.navigate();
		conn.click("startNowButton_xpath");
		
	}
	
//	@After     //TODO
//	public void closeTheApplication() {
//		conn.closeBrowser();
//	}
	
	@Given("^I provide a nationality of (.*)$")
	public void provide_nationality(String countryname) {
		
		conn.selectFromDropDown(countryname);
		conn.click("nextStep_xpath");
		
	}
	
	@And("^I select the reason (.*)$")
	public void select_reason(String reason) {
		
		//conn.click("ukVisaReasonRadioButtons_xpath");
		conn.selectFromRadioButton("ukVisaReasonRadioButtons_xpath", reason);
		conn.click("nextStep_xpath");
	}

	@And("^I state I am intending to stay for (.*)$")
	public void intend_to_stay(String duration) {
		
		conn.selectFromRadioButton("ukVisaDurationRadioButtons_xpath", duration);
		conn.click("nextStep_xpath");
	}
	
	@When("^I submit the form$")
	public void submit() {
		System.out.println("i submit the form ");
		//conn.click("nextStep_xpath");
		
	}
	
	@Then("^I will be informed that (.*)$")
	public void visa_information(String message) {
		
		conn.validateMessage("visaInformationMessage_xpath",message);
	}
	
	@And("^I state (.*) I am not travelling or visiting a partner or family$")
	public void reason_to_travel(String answer) {
		System.out.println(answer+ " I am not travelling or visiting a partner or family");
		conn.selectFromRadioButton("RadioButtons_xpath", answer);
		conn.click("nextStep_xpath");
	}
}
