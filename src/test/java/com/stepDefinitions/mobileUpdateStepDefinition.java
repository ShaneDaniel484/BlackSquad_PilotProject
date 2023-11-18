package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.actions.loginPageActions;
import com.actions.mobileUpdateAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mobileUpdateStepDefinition {

	 WebDriver driver;
	    mobileUpdateAction action;

	    @Given("USER IS on Thomascook Website")
	    public void user_is_on_thomascook_website() {
	        driver = new EdgeDriver();
	        driver.get("https://www.thomascook.com/");
	        action = new mobileUpdateAction(driver);
	    }

	    @When("the user click on my account")
	    public void the_user_click_on_my_account() {
	        action.clickOnMyAccount();
	    }

	    @When("the user click an View  My account")
	    public void the_user_click_an_view_my_account() {
	        action.clickOnViewMyAccount();
	    }

	    @When("the user click a edit button")
	    public void the_user_click_a_edit_button() {
	        action.clickOnEditButton();
	    }

	    @When("the user changes a mobile number")
	    public void the_user_changes_a_mobile_number() {
	        action.changeMobileNumber("1234567890");
	    }

	    @When("user click a save button")
	    public void user_click_a_save_button() {
	        action.clickOnSaveButton();
	    }

	    @Then("changes successfull message is displayed")
	    public void changes_successfull_message_is_displayed() {
	        String successMessage = action.getSuccessMessage();
	        // Add code to assert that the success message is as expected
	    }
}

