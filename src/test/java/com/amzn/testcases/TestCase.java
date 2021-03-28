package com.amzn.testcases;

import org.testng.annotations.Test;

import com.amzn.base.TestBase;
import com.amzn.pages.HomePage;
import com.amzn.pages.HomePage2;
import com.amzn.pages.PaymentsPage;
import com.amzn.pages.ProductsPage;
import com.amzn.pages.SearchResultPage;
import com.amzn.pages.SigninPasswordPage;
import com.amzn.pages.SigninUsernamePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;

public class TestCase extends TestBase {
	
  HomePage homepage;
  SigninUsernamePage signinUsernamePage;
  SigninPasswordPage signinPasswordPage;
  HomePage2 homePage2;
  SearchResultPage searchResultPage;
  ProductsPage productsPage; 
  PaymentsPage  paymentsPage; 
  
  public TestCase() {
	  super();
  }
	@Test(priority=1)
  //sign in page first
	public void Signinfirststep() {
		homepage = new HomePage();
		signinUsernamePage = homepage.homepage1();
		
		  
	}
	@Test(priority=2)
	  public void SigninSecondstep() {
		 signinPasswordPage = signinUsernamePage.nextstep();
		 
	}
	@Test(priority=3)
	  public void SigninThirdstep() {
		 homePage2 = signinPasswordPage.nextstep();
		 
	}
	
	@Test(priority=4)
	  public void Search() {
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  searchResultPage = homePage2.nextstep();
		  productsPage = searchResultPage.nextstep();
		  
		 // productsPage.changetab();
		  
		  paymentsPage = productsPage.nextstep();
  }
	
  @BeforeMethod
  public void beforeMethod() {
	 
	  
	
	  
	  
  }
  
  @BeforeTest
  public void BeforeTest() {
	  TestBase.intialization();
  }
  

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
