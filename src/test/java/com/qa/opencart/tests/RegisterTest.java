package com.qa.opencart.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;


public class RegisterTest extends BaseTest{
	
@BeforeClass
public void regSetUp() {
	registerPage=loginpage.goToRegisterationPage();
}
	
	@DataProvider
	public Object[][] RegisterPageInfo() {
		return new Object[][] {
			{"saurav","tyagi","tyagi@gmail.com","1234567890","Bhole@10", "Bhole@10"}
		};
	}
	
	@Test(dataProvider="RegisterPageInfo")
	public void fillRegisterPageTest(String firstName, String lastName, 
			String email, String telephone, String password, String confirmPassword) throws InterruptedException {
		
		registerPage.fillRegisterationForm(firstName, lastName, email, telephone, password, confirmPassword);
		Thread.sleep(3000);
	}
	

}
