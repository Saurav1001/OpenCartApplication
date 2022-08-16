package com.qa.opencart.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constant.AppConstant;



public class AccountPageTest extends BaseTest{
	
	@BeforeClass
	public void goToAccountsPage() {
		accountPage=loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test
	public void accountPageTitleTest() {
		String title=accountPage.GetAccountTitile();
		Assert.assertEquals(title, AppConstant.HOME_TITLE);
	}
	
	@Test
	public void logoutLinkExistTest() {
		boolean flag=accountPage.isLogoutDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test
	public void accPageHeaderListTest() {
		List<String> headerList=accountPage.isElementsLinkDisplayed();
		
		Assert.assertEquals(headerList, AppConstant.ACC_PAGE_HEADERS_LIST);
	}

}
