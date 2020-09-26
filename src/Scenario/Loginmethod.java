package Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import POMPages.LoginPage;
import POMPages.search;

public class Loginmethod {


	LoginPage lp = new LoginPage();
	//search sp = new search();

	public void Login() throws FileNotFoundException, IOException {
		
		lp.signinaction();
		lp.getUserid();
		lp.getContinueBtn();
		lp.getPwd();
		lp.getSignInSubmit();
		
		
		/*sp.searchByDrpValue();
		sp.searchText();*/

		
	}

	

}
