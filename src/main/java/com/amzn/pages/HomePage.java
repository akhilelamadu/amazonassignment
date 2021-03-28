 package com.amzn.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzn.base.TestBase;

public class HomePage extends TestBase {
	

	
	WebElement accounts = driver.findElement(By.xpath(propx.getProperty("accounts")));	
	WebElement signinbtn = driver.findElement(By.xpath(propx.getProperty("signinbtn")));
	
		


	
	public String validatehomepage() {
		return driver.getTitle();
	}
	
	public SigninUsernamePage homepage1() {
		Actions actions = new Actions(driver);
		actions.moveToElement(accounts).perform();
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(signinbtn));
		signinbtn.click();
		return new SigninUsernamePage();
		
	}
}

