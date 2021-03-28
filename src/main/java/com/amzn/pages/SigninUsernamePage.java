package com.amzn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzn.base.TestBase;

public class SigninUsernamePage extends TestBase {

	WebElement Username = driver.findElement(By.xpath(propx.getProperty("Username")));	
	WebElement Continue = driver.findElement(By.xpath(propx.getProperty("Continue")));
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public SigninPasswordPage nextstep() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Username));
		Username.sendKeys(prop.getProperty("Username"));
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Continue));
		Continue.click();
		
		return  new SigninPasswordPage();
	}
}
