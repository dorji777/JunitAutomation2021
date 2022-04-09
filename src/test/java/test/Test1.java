package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllPage;
import util.BrowserFactory;





public class Test1 {

	WebDriver driver;
	String addlistItem = "Junit";
	String enteredList;
	
	@Test
	public void validateToggleAll() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		ToggleAllPage toggleall = PageFactory.initElements(driver, ToggleAllPage.class);
		
		
		Thread.sleep(3000);
		toggleall.addItemList(enteredList);
		Thread.sleep(3000);
		
		toggleall.clickToggleAll();
		Thread.sleep(3000);
		
	}
}
