package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cruisePageLocators {
	@FindBy(xpath ="//a[@id='cruisePath']")
		public WebElement cruiseButton;
		
		@FindBy(xpath ="//option[text()='Africa']")
		public WebElement SelectDepartureCity;
		
		
		@FindBy(xpath ="//option[text()='Jan-2024]")
		public WebElement SailMonths;
		
		@FindBy(id="duration")
		public WebElement SelectNights;
		
		@FindBy(xpath ="//option[text()='Cordelia Cruises]")
		public WebElement SelectCruiseLine;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-block']")	 
		public WebElement  Search;
		
		@FindBy(xpath="//span[@class='text']")
		public WebElement ModifySearch;
	}

