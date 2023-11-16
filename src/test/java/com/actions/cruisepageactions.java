package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.cruisePageLocators;


 
public class cruisepageactions {
	cruisePageLocators cruisepagelocators;
	
	public cruisepageactions() {
		this.cruisepagelocators = new cruisePageLocators();
		//PageFactory.initElements(BaseClass.getDriver(), cruisepagelocators);
	}
	public void clickButton() {
		cruisepagelocators.cruiseButton.click();
	}
	public void setSelectDepartureCity(String strSelectDepartureCity) {
		cruisepagelocators.SelectDepartureCity.click();
	}
	public void selectSailMonths(String strSailMonths) {
		cruisepagelocators.SailMonths.sendKeys(strSailMonths);
	}
	public void selectSelectNights(String strSelectNights) {
		cruisepagelocators.SelectNights.sendKeys(strSelectNights);
	}
	public void selectSelectCruiseLine(String strSelectCruiseLine) {
		cruisepagelocators.SelectNights.sendKeys(strSelectCruiseLine);
	}
	public void searchButton() {
		cruisepagelocators.Search.click();
	}
	public void ModifySearchButton() {
		cruisepagelocators.ModifySearch.click();
	}
	public void LoginUser(String strSelectDepartureCity,String strSailMonths,String strSelectNights, String strSelectCruiseLine ) {
		setSelectDepartureCity(strSelectDepartureCity);
		selectSailMonths(strSailMonths);
		selectSelectNights(strSelectNights);
		selectSelectCruiseLine(strSelectCruiseLine); 
	}
}
 
