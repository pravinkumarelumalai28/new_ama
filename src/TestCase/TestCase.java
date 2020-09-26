package TestCase;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POMPages.search;
import Scenario.Loginmethod;
import Scenario.SearchMethod;
import baseclass.BaseClass;

public class TestCase {

	WebDriver driver;
	Loginmethod Lm ;
	BaseClass ca;
	search ss;
	SearchMethod si;
		
	@BeforeSuite
	public void browser()
	{
		ca=new BaseClass();
		ca.launchbrowser();
		Lm=new Loginmethod();
		ss= new search();
		si=new SearchMethod();
	}
	
	@Test(priority=0)
	public void Loginfunction() throws Throwable
	{
		Lm.Login();
		
		
		
	}
	@Test(priority=1)
	public void searchfunction() throws FileNotFoundException, IOException, InterruptedException {	
		si.SearchItems();
		
	}
}
