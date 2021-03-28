package com.amzn.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amzn.base.TestBase;

public class ProductsPage extends TestBase {

	WebElement Buynow = driver.findElement(By.xpath(propx.getProperty("Buynow")));
	
	public void changetab() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    //driver.close();
		driver.switchTo().window(tabs2.get(1));
	}
	
	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	public PaymentsPage nextstep() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Buynow));
		Buynow.click();
		return  new PaymentsPage();
	}
}
