package com.cucumber.ukvisainfo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.gov.uk/check-uk-visa")                     
public class HomePage extends PageObject {              


    @FindBy(css = "button[value='Search']")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-query").sendKeys(keywords);          
        searchButton.click();                           
    }
    
    
    public void StartNow() {
    	$("//*[@id=\"get-started\"]/a").click();
    }

}



