package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constant.AppConstant;
import com.qa.opencart.elementutil.ElementUtil;

public class AccountsPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	public AccountsPage(WebDriver driver) {
		this.driver = driver;

		eleUtil = new ElementUtil(driver);
	}

	private By allPageLinks=By.xpath("//div[@id='content']/h2");
	private By logoutLink=By.linkText("Logout");
	private By searchBox=By.name("search");
	private By searchIcon=By.xpath("//i[@class='fa fa-search']");
	
			
			
	public String GetAccountTitile() {
		String titile=eleUtil.waitForTitleToBe(AppConstant.HOME_TITLE, AppConstant.SMALL_TIMEOUT);
		return titile;
	}
	
	public List<String> isElementsLinkDisplayed() {
		
		List<String> getAllElementsList=eleUtil.getAllElementsTextList(allPageLinks, AppConstant.SMALL_TIMEOUT);
		System.out.println(getAllElementsList);
		return getAllElementsList;
	}
	
	public boolean isLogoutDisplayed() {
		return eleUtil.waitForElementVisible(logoutLink, AppConstant.SMALL_TIMEOUT).isDisplayed();
	}
	
	public SearchResultPage goToSearchPage(String serachItem) {
		eleUtil.doSendKeysWithWait(searchBox, AppConstant.SMALL_TIMEOUT, serachItem);
		eleUtil.doClick(searchIcon);
		return new SearchResultPage(driver);
	}

//	private SearchResultPage SearchResultPage(WebDriver driver2) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
