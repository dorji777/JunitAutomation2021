package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveSingleItem;
import page.ToggleAllandRemove;
import util.BrowserFactory;


public class Test3 {

	WebDriver driver;
	String addlistItem = "Junit";
	String enteredList;
	
	@Test
	public void validateToggleAll() throws Exception {
		
		driver = BrowserFactory.init();
		
		ToggleAllandRemove toggleallremoveall = PageFactory.initElements(driver, ToggleAllandRemove.class);
		
		toggleallremoveall.totalCheckListItemBeforeDeleting();
		Thread.sleep(3000);
		toggleallremoveall.clickToggleAllnRemove();
		Thread.sleep(3000);
		toggleallremoveall.totalCheckListItemAfterDeleting();
		
	}
}
