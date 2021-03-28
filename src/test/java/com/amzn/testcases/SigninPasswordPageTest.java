package com.amzn.testcases;

import org.testng.annotations.Test;

import com.amzn.base.TestBase;
import com.amzn.pages.HomePage2;
import com.amzn.pages.SigninPasswordPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;


public class SigninPasswordPageTest extends TestBase{
	SigninPasswordPage signinPasswordPage;
	HomePage2 homepage2;
	
	SigninPasswordPageTest(){
		super();
	}
	
	
	@BeforeMethod
	  public void beforeMethod() {
		  
		  signinPasswordPage = new  SigninPasswordPage();
	  }
	
  @Test(priority =1)
  public void titlecheck() {
	  String title = signinPasswordPage.validatepagetitle();
	  Assert.assertEquals(title, "Amazon Sign In");
  }
  
  @Test(priority =2)
  public void nextstep() {
	  homepage2 = signinPasswordPage.nextstep();
	  
  }
  

 

}
