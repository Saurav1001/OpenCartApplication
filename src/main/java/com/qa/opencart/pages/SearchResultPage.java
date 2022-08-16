package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.constant.AppConstant;
import com.qa.opencart.elementutil.ElementUtil;

public class SearchResultPage {
	private WebDriver driver;
	private ElementUtil eleUtil;

	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public void serachPageTitle() {
		eleUtil.waitForTitleToBe(AppConstant.HOME_TITLE, AppConstant.SMALL_TIMEOUT);
	}

}
