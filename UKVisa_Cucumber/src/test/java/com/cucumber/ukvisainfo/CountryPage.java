package com.cucumber.ukvisainfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class CountryPage extends PageObject {
	
  

	public void select(String countryname) {
		WebElement e = $("//*[@id='response']");
		Select s = new Select(e);
		s.selectByVisibleText(countryname);
		}


	public void nextstep() {
		$("/html/body/div[6]/main/div/div/form/div/button").click();
		}
}
