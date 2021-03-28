package com.amzn.testcases;

import org.testng.annotations.Test;

import com.amzn.base.TestBase;
import com.amzn.pages.SigninPasswordPage;
import com.amzn.pages.SigninUsernamePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;


public class SigninUsernamePageTest extends TestBase {
	
	SigninUsernamePage signinUsernamePage;
	SigninPasswordPage signinPasswordPage;
	
	SigninUsernamePageTest(){
		super();
	}
	
	
  @Test(priority = 1)
  public void titlecheck() {
	  String title = signinUsernamePage.validatepagetitle();
	  Assert.assertEquals(title, "Amazon Sign In");
  }
  
  @Test(priority = 2)
  public void nexstep() {
	  signinPasswordPage = signinUsernamePage.nextstep();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  signinUsernamePage = new  SigninUsernamePage();
	  
  }

  

}
