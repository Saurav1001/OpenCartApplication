package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.pages.SearchResultPage;

public class BaseTest {
	public WebDriver driver;
	public DriverFactory df;
	public Properties prop;
	public LoginPage loginpage;
	public RegisterPage registerPage;
	public AccountsPage accountPage;
	public SearchResultPage serachPage;
	
	@BeforeTest
	public void setUp() {
		df=new DriverFactory();
		prop=df.initProp();
		driver=df.driverInIt(prop);
		loginpage=new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
