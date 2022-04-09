package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveSingleItem;
import util.BrowserFactory;


public class Test2 {

	WebDriver driver;
	String addlistItem = "Junit";
	String enteredList;
	
	@Test
	public void validateToggleAll() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		RemoveSingleItem removeItem = PageFactory.initElements(driver, RemoveSingleItem.class);
		
		removeItem.clickSingleItemCheckBox();
		Thread.sleep(3000);
		removeItem.clickRemoveButton();
		
	}
}
