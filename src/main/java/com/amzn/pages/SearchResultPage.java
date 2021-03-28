package com.amzn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzn.base.TestBase;

public class SearchResultPage extends TestBase {
	
	WebElement Author = driver.findElement(By.xpath(propx.getProperty("Author")));
	//WebElement Naruto = driver.findElement(By.xpath(propx.getProperty("Naruto")));
	WebElement Naruto = driver.findElement(By.xpath(propx.getProperty("Naruto")));
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public void authorselection() {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Author);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Author));
		Author.click();
		
	}
	
	
	
	public ProductsPage nextstep() {
		
	WebElement Naruto = driver.findElement(By.xpath(propx.getProperty("Naruto")));
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Naruto));
	Naruto.click();
	
	return  new ProductsPage();

}
	
}
