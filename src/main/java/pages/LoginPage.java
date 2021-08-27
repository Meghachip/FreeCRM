package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Basetest;

public class LoginPage extends Basetest {
	
	
	//OR
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//functions
	public void Title() {
		System.out.println(driver.getTitle());
	}
	
	public void loginInfo(String username, String password) {
		userName.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
	}
	
	
	

}
