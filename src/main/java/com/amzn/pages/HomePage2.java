package com.amzn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzn.base.TestBase;

public class HomePage2 extends TestBase{
	
	
	WebElement Searchbar = driver.findElement(By.xpath(propx.getProperty("Searchbar")));	
	WebElement Searchbutton = driver.findElement(By.xpath(propx.getProperty("Searchbutton")));

	
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public SearchResultPage nextstep()  {
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Searchbar));
		Searchbar.sendKeys("Naruto Manga");
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Searchbutton));
		Searchbutton.click();

		return new SearchResultPage();
	
	
	}
	
}
