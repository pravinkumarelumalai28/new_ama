package Scenario;

import java.io.FileNotFoundException;
import java.io.IOException;

import POMPages.LoginPage;
import POMPages.search;

public class SearchMethod {
	
	
	LoginPage lp = new LoginPage();
	search sp = new search();

	public void SearchItems() throws FileNotFoundException, IOException, InterruptedException {
	
		sp.searchByDrpValue();
		sp.searchText();

		
	}

}
