package com.runner;
 
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags="@register",features="src\\test\\resources\\features\\register.feature",glue ="com.stepDefinitions",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runnerRegister {
 
}