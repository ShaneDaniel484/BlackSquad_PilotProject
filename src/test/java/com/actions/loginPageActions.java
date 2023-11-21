package com.actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.locators.loginPageLocators;
import com.utility.BaseClass;

public class loginPageActions {
loginPageLocators loginpagelocators;
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(20));
	public loginPageActions() {
		loginpagelocators = new loginPageLocators();
		PageFactory.initElements(BaseClass.getDriver(), loginpagelocators);
	}
	public void clickButton1() {
		loginpagelocators.loginButton.click();
	}
	public void clickButton2() {
		loginpagelocators.mainLogin.click();
	}
	public void setEmail(String strEmail) {
		loginpagelocators.EmailId.sendKeys(strEmail);
	}
	public void setPassword(String strPass) {
		loginpagelocators.Password.sendKeys(strPass);
	}
	public void Button() {
		loginpagelocators.Button.click();
	}
	public void logout() {
		loginpagelocators.logout.click();
	}
	public void Message() {
		wait.until(ExpectedConditions.visibilityOf(loginpagelocators.Message));
		Assert.assertEquals(loginpagelocators.Message.getText(),"Please enter valid email id");
		System.out.println("Assert Sucessfully");
	}
	public void LoginUser(String strEmail,String strPass) {
		setEmail(strEmail);
		setPassword(strPass);
		Button();
	}
}
