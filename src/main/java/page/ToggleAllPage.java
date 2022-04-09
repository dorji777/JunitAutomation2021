package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllPage extends BasePage {
	
	
	WebDriver driver;
	String addlistItem = "Junit";
	String enteredList = addlistItem + generateRandomNum(999);
	
	public ToggleAllPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
		@FindBy(how = How.CSS,using ="input[value='on']") WebElement Toggle_all_element;
		@FindBy(how = How.CSS,using = "input[name='data']") WebElement add_item_Element;
		@FindBy(how = How.CSS,using = "input[value='Add']") WebElement add_Button_Element;
		@FindBy(how = How.CSS,using = "li[style='font-size: 16px']") List<WebElement> all_checkbox_Element;
		@FindBy(how = How.CSS,using = "input[type='checkbox']") WebElement verify_checkbox_Element;
		
		
		public void addItemList(String addlistItem) {
		//	BasePage basepage = new BasePage();
		//	String enteredList = addlistItem + generateRandomNum(999); 
			add_item_Element.sendKeys(enteredList);
			add_Button_Element.click();
		}


		public void clickToggleAll() {
	
			Toggle_all_element.click();
	
	
  }

}