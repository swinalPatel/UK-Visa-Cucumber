package com.cucumber.ukvisainfo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PurposePage extends PageObject {

    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> allRadios;
	

//    public List<String> getResultTitles() {
//    	
//    	System.out.println(allRadios.size());
//    	    	
//        return allRadios.stream()
//                .map(element -> element.getText())
//                .collect(Collectors.toList());
//    }

    
	public void select(String reason) {
		
		System.out.println("Total Radio Buttons: " +allRadios.size()  );
		System.out.println("hi");
		for(int i=0; i<allRadios.size(); i++) {
			System.out.println("values of radios: " + allRadios.get(i).getText() );
			if(allRadios.get(i).getText().equals(reason)) {
				System.out.println("Matched: " + allRadios.get(i).getText());
				
				String s1="//*[@id='response-";
				String s2="']";
				String s3_xpath=s1+i+s2;
				$(s3_xpath).click();
				
//				driver.findElement(By.xpath(s3_xpath)).click();
				break;
				}
		}
		
		
		
		}


	public void nextstep() {
		$("/html/body/div[6]/main/div/div/form/div/button").click();
		}
}
