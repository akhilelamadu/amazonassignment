package com.amzn.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amzn.base.TestBase;
import com.amzn.pages.HomePage;
import com.amzn.pages.SigninUsernamePage;

public class HomePageTest extends TestBase {

	HomePage homepage;
	SigninUsernamePage signinUsernamePage;
	
	public HomePageTest(){
		super();
	}

	@BeforeTest
	public void setup(){

		TestBase.intialization();
	}

	@BeforeMethod
	public void pageload() {
		homepage = new HomePage();


	}



	@Test(priority=1)
	public void titlecheck() {

		String title = homepage.validatehomepage();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}


	@Test(priority=2)
	public void nextstep() {

		signinUsernamePage = homepage.homepage1();
	}


	@AfterTest
	public void end() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
	}

}
