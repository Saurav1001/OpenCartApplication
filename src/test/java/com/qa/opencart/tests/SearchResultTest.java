package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SearchResultTest extends BaseTest{
	
	@BeforeClass
	public void searchPageSetUp() {
		serachPage=accountPage.goToSearchPage(prop.getProperty("serachItem"));
			
		}
	
	@Test
	public void getTitleTest() {
		serachPage.serachPageTitle();
	}
	}


