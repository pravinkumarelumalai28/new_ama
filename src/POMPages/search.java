package POMPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class search extends BaseClass{

	public search()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@aria-label='Amazon']")
	private WebElement Logo;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchValue;

	@FindBy(xpath="//input[@value='Go']")
	private WebElement search;

	@FindBy(xpath="//div[@id='nav-search-dropdown-card']//select")
	private WebElement drpValue;
	
	@FindBy(xpath="//div[@class='nav-fill']//select//option[8]")
	private WebElement item;

	

	
	public void searchText(){
		try {		
			Textinput(searchValue, "Apple");
			click(search);			
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void searchByDrpValue() throws InterruptedException{		
		try{
			click(drpValue);
			
			selectFromDrpValue(drpValue, getproperty("select"));
			click(search);				
		}catch (Exception e) {
			
		}
		Thread.sleep(3000);
	}
	

}
