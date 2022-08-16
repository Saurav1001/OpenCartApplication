package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constant.AppConstant;
import com.qa.opencart.elementutil.ElementUtil;

public class LoginPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By email=By.id("input-email");
	private By password=By.id("input-password");
	private By loginbtn=By.xpath("//input[@value='Login']");
	private By forgotpasswdbtn=By.linkText("Forgotten Password");
	private By register=By.linkText("Register");
	
			
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	
	public String getLoginPageTitle() {
		String title=eleUtil.waitForTitleToBe(AppConstant.LOGIN_TITLE, AppConstant.SMALL_TIMEOUT);
		System.out.println("Login Page Title is : "+ title);
		return title;
	}
	
	public String getLoginPageUrl() {
		
		String currentUrl=eleUtil.waitForUrl(AppConstant.SMALL_TIMEOUT, AppConstant.LOGIN_URL_FRACTION);
		System.out.println("Login Page current url is : "+ currentUrl);
		return currentUrl;
	}
	
	public AccountsPage doLogin(String username, String password) {
		eleUtil.doSendKeysWithWait(email, AppConstant.SMALL_TIMEOUT, username);
		eleUtil.doSendKeys(this.password, password);
		eleUtil.doClick(loginbtn);
		eleUtil.waitForTitleToBe(AppConstant.HOME_TITLE, AppConstant.SMALL_TIMEOUT);
		
		return new AccountsPage(driver);
}
	public boolean isForgotPasswdExit() {
		return eleUtil.waitForElementPresence(forgotpasswdbtn, AppConstant.SMALL_TIMEOUT).isDisplayed();
	}
	
	public RegisterPage goToRegisterationPage() {
		eleUtil.doClick(register);
		return new RegisterPage(driver);
	}
}
