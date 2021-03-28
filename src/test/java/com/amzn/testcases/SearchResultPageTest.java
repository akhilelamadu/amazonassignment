package com.amzn.testcases;

import org.testng.annotations.Test;

import com.amzn.pages.ProductsPage;
import com.amzn.pages.SearchResultPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;


public class SearchResultPageTest {
	
	SearchResultPage searchResultPage;
	ProductsPage  productsPage;	
	
	SearchResultPageTest(){
		super();
	}
	
	  @BeforeMethod
	  public void beforeMethod() {
		  searchResultPage = new SearchResultPage();
	  }
	
	  
  @Test(priority = 1)
  public void checktitle() {
	  String title = searchResultPage.validatepagetitle();
	  Assert.assertEquals(title, "Amazon.in : Naruto Manga");
	  
  }

  @Test(priority=2)
	public void authorselection() {
	  searchResultPage.authorselection();
		
	}
  
  @Test(priority=3)
	public void nextstep() {
	  searchResultPage.nextstep();
		
	}

 
}
