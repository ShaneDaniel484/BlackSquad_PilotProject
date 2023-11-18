package com.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.locators.mobileUpdateLocators;

public class mobileUpdateAction {

    private mobileUpdateLocators locators;

    public mobileUpdateAction(WebDriver driver) {
        this.locators = new mobileUpdateLocators();
        PageFactory.initElements(driver, this.locators);
    }
    public void clickOnMyAccount() {
        this.locators.Accountdropdown.click();
    }

    public void clickOnViewMyAccount() {
        this.locators.Viewmyaccount.click();
    }

    public void clickOnEditButton() {
        this.locators.Edit.click();
    }

    public void changeMobileNumber(String newNumber) {
        this.locators.mobileNumber.clear();
        this.locators.mobileNumber.sendKeys(newNumber);
    }

    public void clickOnSaveButton() {
        this.locators.saveButton.click();
    }

    public String getSuccessMessage() {
        // Add code to retrieve the success message
        return "";
    }
}

