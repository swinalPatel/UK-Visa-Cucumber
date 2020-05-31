package com.cucumber.ukvisainfo;

import org.junit.Assert;

import net.serenitybdd.core.pages.PageObject;

public class UKVisaInformationPage extends PageObject {

	public void verification(String Expected_Message) {
		
		String actualResult = $("//*[@id=\"result-info\"]/div[2]/h2").getText();
		System.out.println("Message from website: " + actualResult);
		System.out.println("Meesage from features: " + Expected_Message );
		String Actual_Result = actualResult.replace("You’ll", "You will");
	    Actual_Result = Actual_Result.replace("won’t", "will not");
		System.out.println("Visa Information : " + Actual_Result);
	
		Assert.assertEquals(Expected_Message, Actual_Result);
		
		}
		
	}


