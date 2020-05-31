package com.cucumber.ukvisainfo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class VisitFamilyResonsePage  extends PageObject {

	  @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
	    List<WebElement> allRadios;
	  
	public void select(String answer) {
		System.out.println("answser in visitfamilypage :" + answer);
		System.out.println("Total Radio Buttons: " +allRadios.size()  );
		
		for(int i=0; i<allRadios.size(); i++) {
			System.out.println("values of radios: " + allRadios.get(i).getText() );
			if(allRadios.get(i).getText().equals(answer)) {
				System.out.println("Matched: " + allRadios.get(i).getText());
				
				String s1="//*[@id='response-";
				String s2="']";
				String s3_xpath=s1+i+s2;
				$(s3_xpath).click();
				break;
				}
		}
	}
		
	public void nextstep() {
		$("/html/body/div[6]/main/div/div/form/div/button").click();
		}
		
} 


