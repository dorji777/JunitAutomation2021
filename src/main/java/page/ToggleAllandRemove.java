package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllandRemove extends BasePage {
	
	
	WebDriver driver;
	String addlistItem = "Junit";
	String enteredList = addlistItem + generateRandomNum(999);
	
	public ToggleAllandRemove(WebDriver driver) {
		
		this.driver = driver;
		
	}
		@FindBy(how = How.CSS,using ="input[value='on']") WebElement Toggle_all_element;
		@FindBy(how = How.CSS,using = "input[name='data']") WebElement add_item_Element;
		@FindBy(how = How.CSS,using = "input[value='Add']") WebElement add_Button_Element;
		@FindBy(how = How.CSS,using = "li[style='font-size: 16px']") List<WebElement> all_checkbox_Element;
		@FindBy(how = How.CSS,using = "input[type='checkbox']") WebElement verify_checkbox_Element;
		@FindBy(how = How.CSS,using = "input[value='Remove']") WebElement remove_button_Element;
		
		
		public void totalCheckListItemBeforeDeleting() throws Exception {
			List<WebElement> checkbox =  all_checkbox_Element;
			System.out.println("Total no of Checkboxes before deleting: " + checkbox.size());
			Thread.sleep(3000);
			
		}
		
		
		public void clickToggleAllnRemove() throws Exception {
	
			Toggle_all_element.click();
			Thread.sleep(3000);
			remove_button_Element.click();
	
	
  }
		public void totalCheckListItemAfterDeleting() throws Exception {
			List<WebElement> checkbox =  all_checkbox_Element;
			System.out.println("Total no of Checkboxes before deleting: " + checkbox.size());
			Thread.sleep(3000);
			
		}
		
		
}