package Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import POMPages.LoginPage;
import POMPages.search;
import baseclass.BaseClass;

public class SearchMethod extends BaseClass{
	
	
	LoginPage lp = new LoginPage();
	search sp = new search();

	public void SearchItems() throws FileNotFoundException, IOException, InterruptedException {
		
		PageFactory.initElements(driver, this);
	
		sp.searchByDrpValue();
		sp.searchText();
		
		Thread.sleep(3000);
		
		driver.getTitle();
		if(driver.getTitle().equals("Amazon.in : Apple")) {
			driver.close();
		}
		
		

		
	}

}
