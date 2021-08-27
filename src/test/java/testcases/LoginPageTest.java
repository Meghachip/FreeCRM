package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Basetest;
import pages.LoginPage;

public class LoginPageTest extends Basetest {
	
	LoginPage loginpage;;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		
	}
	
	@Test
	public void validateTitle() {
		loginpage.Title();
		
	}
	
	@Test
	public void validateLogin() {
		loginpage.loginInfo(config.getProperty("userName"), config.getProperty("password"));
	}

}
