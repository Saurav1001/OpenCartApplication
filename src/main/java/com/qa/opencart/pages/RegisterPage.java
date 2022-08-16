package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.opencart.elementutil.ElementUtil;

public class RegisterPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		eleUtil=new ElementUtil(driver);
	}
	private By firstName=By.id("input-firstname");
	private By lastName=By.id("input-lastname");
	private By email=By.id("input-email");
	private By telephone=By.id("input-telephone");
	private By password=By.id("input-password");
	private By confirmPassword=By.id("input-confirm");
	
	
	public void fillRegisterationForm(String firstName, String lastName, 
			String email, String telephone, String password, String confirmPassword ) {
		eleUtil.doSendKeysWithWait(this.firstName, 5, "firstName");
		eleUtil.doSendKeys(this.lastName, lastName);
		eleUtil.doSendKeys(this.email, email);
		eleUtil.doSendKeys(this.telephone, telephone);
		eleUtil.doSendKeys(this.password, password);
		eleUtil.doSendKeys(this.confirmPassword, confirmPassword);
		
	}

}
