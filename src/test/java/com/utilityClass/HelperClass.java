package com.utilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class HelperClass {
	public static HelperClass helperclass;
	private static WebDriver driver;
	
	private static WebDriver wait;
	public final static int TIMEOUT = 10;
	
	//constructor
	HelperClass(){
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperclass == null) {
			helperclass = new HelperClass();			
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		helperclass = null;
	}
}