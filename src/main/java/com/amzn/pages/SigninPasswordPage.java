package com.amzn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzn.base.TestBase;

public class SigninPasswordPage extends TestBase {
	
	WebElement Password = driver.findElement(By.xpath(propx.getProperty("Password")));	
	WebElement Signin = driver.findElement(By.xpath(propx.getProperty("Signin")));
	
	public String validatepagetitle() {
		return driver.getTitle();
	}

	public HomePage2 nextstep() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Password));
		Password.sendKeys(prop.getProperty("Password"));
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Signin));
		Signin.click();
		
		return  new HomePage2();
	}
}
