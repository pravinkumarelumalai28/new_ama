package Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import POMPages.LoginPage;
import POMPages.search;
import baseclass.BaseClass;

public class Loginmethod extends BaseClass{


	LoginPage lp = new LoginPage();
	
	
	

	public void Login() throws FileNotFoundException, IOException, Throwable {
	
		PageFactory.initElements(driver, this);
		
		lp.singninicon();
		lp.getUserid();
		lp.getContinueBtn();
		lp.getPwd();
		lp.getSignInSubmit();
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
{System.out.println("login success");
}
		
		
		
		
		
		
	}

	

}
