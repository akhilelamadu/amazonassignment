package com.amzn.testcases;

import org.testng.annotations.Test;

import com.amzn.pages.PaymentsPage;
import com.amzn.pages.ProductsPage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class ProductsPageTest {
	
	ProductsPage productsPage;
	PaymentsPage paymentsPage;
	
	ProductsPageTest() {
		super();
		
		}
	
	
  @Test(priority = 1)
  public void checktitle() {
	 String title = productsPage.validatepagetitle();
	 Assert.assertEquals(title, "Buy Naruto 01: Uzumaki Naruto: Volume 1 Book Online at Low Prices in India |"
	 +" Naruto 01: Uzumaki Naruto: Volume 1 Reviews &amp; Ratings - Amazon.in");
	    
  }
  
  @Test(priority = 2)
  public void nextstep() {
	  productsPage.nextstep();
	    
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  productsPage = new ProductsPage();
	  productsPage.changetab();
  }

}
