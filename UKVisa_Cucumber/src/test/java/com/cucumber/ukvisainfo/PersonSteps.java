package com.cucumber.ukvisainfo;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import com.cucumber.ukvisainfo.HomePage;

public class PersonSteps{


    HomePage homePage;   
    CountryPage countryPage;
    PurposePage purposePage;
    DurationPage durationPage;
    VisitFamilyResonsePage visitfamilyreasonpage;
    UKVisaInformationPage ukvisainformationpage;
	   
    @Step
   public void open_home_page(  ) {
    	homePage.open();
		homePage.StartNow();
		
    }
    
	@Step
	public void provide_nationality_of(String countryname) {
		countryPage.select(countryname);
		countryPage.nextstep();
	}

	@Step   
	public void select_reason_of(String reason) {
//		System.out.println(purposePage.getResultTitles());
//		;
		purposePage.select(reason);
		purposePage.nextstep();		
		
		System.out.println("hi");
	}

	@Step   
	public void select_intend_to_stay_for(String duration) {
		durationPage.select(duration);
		System.out.println("hi");
		durationPage.nextstep();
		System.out.println("hi");
		
	}

	@Step
	public void submit_the_form() {
		}

	

	@Step    
	public void state_not_travelling_or_visiting_partner_or_family(String answer) {
		
		visitfamilyreasonpage.select(answer);
		visitfamilyreasonpage.nextstep();
		
	}
	@Step   
	public void get_message_that(String message) {
		
		ukvisainformationpage.verification(message);
	}
	
}
