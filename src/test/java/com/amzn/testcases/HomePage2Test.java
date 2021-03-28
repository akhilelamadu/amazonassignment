package com.amzn.testcases;

import org.testng.annotations.Test;

import com.amzn.base.TestBase;
import com.amzn.pages.HomePage2;
import com.amzn.pages.SearchResultPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

public class HomePage2Test extends TestBase {

	HomePage2 homePage2;
	SearchResultPage searchResultPage;

	HomePage2Test(){
		super();
	}

	

	
	@Test(priority=1)
	public void titlecheck() {
		String title = homePage2.validatepagetitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=2)
	public void nextstep() {
		searchResultPage = homePage2.nextstep();
		
	}

	@BeforeMethod
	public void beforeMethod() {
		homePage2 = new HomePage2();
	}

}
