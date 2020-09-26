package TestCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POMPages.search;
import Scenario.Loginmethod;
import Scenario.SearchMethod;
import baseclass.CommonAction;

public class AmazonTest {

	WebDriver driver;
	Loginmethod Lm ;
	CommonAction ca;
	search ss;
	SearchMethod si;
		
	@BeforeSuite
	public void browser()
	{
		ca=new CommonAction();
		ca.launchbrowser();
		Lm=new Loginmethod();
		ss= new search();
		si=new SearchMethod();
	}
	
	@Test(priority=0)
	public void Loginfunction() throws FileNotFoundException, IOException, InterruptedException
	{
		Lm.Login();
		
	}
	@Test(priority=1)
	public void searchfunction() throws FileNotFoundException, IOException, InterruptedException {	
		si.SearchItems();
		
	}
}
