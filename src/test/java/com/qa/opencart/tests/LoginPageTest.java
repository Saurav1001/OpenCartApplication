package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constant.AppConstant;

public class LoginPageTest extends BaseTest{
	@Test
	public void LoginTitleTest() {
		String title=loginpage.getLoginPageTitle();
		Assert.assertEquals(title,AppConstant.LOGIN_TITLE );
	}
	
	@Test
	public void LoginGetUrlTest() {
		String currentUrl=loginpage.getLoginPageUrl();
		Assert.assertEquals(currentUrl.contains(AppConstant.LOGIN_URL_FRACTION), true);
	}
	
//	@Test
//	public void doLoginTest() {
//		String homeTitle=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
//		Assert.assertEquals(homeTitle, AppConstant.HOME_TITLE);
//	}
	
	@Test
	public void forgotPasswordLinkExitsTest() {
		boolean flag=loginpage.isForgotPasswdExit();
		Assert.assertEquals(flag, true);
	}
	

}
