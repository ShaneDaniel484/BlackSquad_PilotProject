package com.actions;

import java.time.Duration;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.cruisePageLocators;
import com.utility.BaseClass;


 
public class cruisepageactions {
	cruisePageLocators cruisepagelocators;
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(15));
	
	public cruisepageactions() {
		this.cruisepagelocators = new cruisePageLocators();
		PageFactory.initElements(BaseClass.getDriver(), cruisepagelocators);
	}
	public void clickButton() throws InterruptedException {
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cruisepagelocators.cruiseButton.click();
		String parentWindow = BaseClass.getDriver().getWindowHandle();
		Set<String> allWindows = BaseClass.getDriver().getWindowHandles();
		//System.out.println("Total no of windows :"+allWindows.size());
		for(String id: allWindows) {
			//System.out.println("The window id is :" + id);
			BaseClass.getDriver().switchTo().window(id);
		}	
		
	}
	public void setSelectDepartureCity() {
		cruisepagelocators.SelectDepartureCity.click();
		Select s = new Select(cruisepagelocators.SelectDepartureCity);
		s.selectByVisibleText(" Australia");
	}
	public void selectSailMonths() {
		cruisepagelocators.SailMonths.click();
		Select s = new Select(cruisepagelocators.SailMonths);
		s.selectByVisibleText("Jan-2024");
	}
	public void selectSelectNights() {
		cruisepagelocators.SelectNights.click();
		Select s = new Select(cruisepagelocators.SelectNights);
		s.selectByVisibleText("1 To 3 night(s)");
	}
	public void selectSelectCruiseLine() {
		cruisepagelocators.SelectCruiseLine.click();
		Select s = new Select(cruisepagelocators.SelectCruiseLine);
		s.selectByVisibleText("Cordelia Cruises");
	}
	public void searchButton() {
		cruisepagelocators.Search.click();
	}
	public void ModifySearchButton() {
		cruisepagelocators.ModifySearch.click();
	}
	
	public void searchResults() {
		wait.until(ExpectedConditions.visibilityOf(cruisepagelocators.searchResults));
		String searchResult = cruisepagelocators.searchResults.getText();
		Assert.assertEquals(searchResult,"2 Nights | Cruise Weekender");
		System.out.println("search results asserted successfully");
	}
	
	public void modifySearch() {
		cruisepagelocators.SelectDepartureCity.click();
		Select s = new Select(cruisepagelocators.SelectDepartureCity);
		s.selectByVisibleText(" Australia");
		cruisepagelocators.modifyDate.click();
		Select s1 = new Select(cruisepagelocators.modifyDate);
		s1.selectByVisibleText(" Jan-2025");
		cruisepagelocators.applyModifySearch.click();
		
	}
	public void modifySearchResluts() {
		Boolean modifySearchResults = cruisepagelocators.modifySearchResults.isDisplayed();
		//Assert.assertEquals(modifySearchResults,"15 Nights | Australia");
		Assert.assertTrue(modifySearchResults);
		System.out.println("modified search results asserted successfully");
	}
//	public void LoginUser(String strSelectDepartureCity,String strSailMonths,String strSelectNights, String strSelectCruiseLine ) {
//		setSelectDepartureCity(strSelectDepartureCity);
//		selectSailMonths(strSailMonths);
//		selectSelectNights(strSelectNights);
//		selectSelectCruiseLine(strSelectCruiseLine); 
//	}
	
}
 
