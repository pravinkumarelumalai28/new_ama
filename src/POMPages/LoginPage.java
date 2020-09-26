package POMPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Hello, Sign in']")
	private WebElement signin;

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement userid;

	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement pwd;

	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBtn;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement signInSubmit;

	
	
	public void singninicon() {
		click(signin);
	}

	
	public void getUserid() throws FileNotFoundException, IOException {
		Textinput(userid, getproperty("username")); 
	}

	public void getPwd() throws FileNotFoundException, IOException {
		Textinput(pwd,getproperty("password"));
	}

	public void getContinueBtn() {
		click(continueBtn);
	}

	public void getSignInSubmit() {
		click(signInSubmit);
	}
	


}