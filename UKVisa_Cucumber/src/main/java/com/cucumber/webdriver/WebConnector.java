package com.cucumber.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebConnector {
	
	public WebDriver driver = null;
	public Properties pro = null;
	
	public WebConnector() throws IOException {
		
		// initialising the properties file
		if(pro==null) {
			try {
			pro = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\project.properties");
			pro.load(fs);
			System.out.println(pro.getProperty("LoginURL"));
			
			} catch (FileNotFoundException e) {
				System.out.println("Error to initialised the properties file");
				e.printStackTrace();
			}
		}
		
	}


	// function to open the browser
	public void openBrowser(String browser) {
		if(browser.equals("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
			
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}
	
	// function to navigate to the given url
	public void navigate() {
		driver.get(pro.getProperty("LoginURL"));
//		String url = "https://www.gov.uk/check-uk-visa";
//		driver.get(url); //TODO: BYPASS URL
	}
	
	
	// function to check object's location using name
	public WebElement getObject(String objectkey) {
		WebElement e = null;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			if(objectkey.endsWith("_id")) {
		       e = driver.findElement(By.id(pro.getProperty(objectkey)));
		       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(pro.getProperty(objectkey))));
			}else if(objectkey.endsWith("_xpath")) {
				e = driver.findElement(By.xpath(pro.getProperty(objectkey)));
			    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(pro.getProperty(objectkey))));
			}else if(objectkey.endsWith("_name")) {
				e = driver.findElement(By.name(pro.getProperty(objectkey)));
			    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(pro.getProperty(objectkey))));
			}
			} catch(Exception ex) {
			System.out.println("element not found");
			ex.printStackTrace();
			}
		return e;
	}
	
	// function to click on object
		public void click(String objectkey) {
			getObject(objectkey).click();
			
		}
		
	// function to select from dropdown menu
		
		public void selectFromDropDown(String selection) {
				
				WebElement e = getObject("coutrySelectDropDown_id");
				
						Select s = new Select(e);
						s.selectByVisibleText(selection);
				}
		
		// function to select 
		public void selectFromRadioButton(String buttonXpath, String selection) {
//			List<WebElement> allRadios = driver.findElements(By.name("response"));
			List<WebElement> allRadios = driver.findElements(By.xpath(pro.getProperty(buttonXpath)));
			System.out.println("Total Radio Buttons: " +allRadios.size());
			for(int i=0; i<allRadios.size(); i++) {
				//System.out.println("values of radios: " + allRadios.get(i).getText() );
				if(allRadios.get(i).getText().equals(selection)) {
					System.out.println("Matched: " + allRadios.get(i).getText());
					
					String s1="//*[@id='response-";
					String s2="']";
					String s3_xpath=s1+i+s2;
					driver.findElement(By.xpath(s3_xpath)).click();
					break;
					}
			}
		}
			
			// function to validate output
			public void validateMessage(String objectkey, String Expected_Result) {
				String actualResult = getObject(objectkey).getText();
				String Actual_Result = actualResult.replace("’", " wi");
				System.out.println("Visa Information : " + Actual_Result);
			
				Assert.assertEquals(Expected_Result, Actual_Result);
				}

			// function to close the browser
			public void closeBrowser() {
				
				driver.close();
			}

			
			
			
			}
		
		    
			
