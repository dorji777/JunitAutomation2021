package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleItem extends BasePage{

	WebDriver driver;
	public  RemoveSingleItem(WebDriver driver) {
		this.driver= driver;
	
	}
	
		@FindBy(how = How.CSS,using = "input[value='Remove']") WebElement remove_button_Element;
		@FindBy(how = How.CSS,using = "input[name='data']") WebElement add_item_Element;
		@FindBy(how = How.CSS,using = "input[value='Add']") WebElement add_Button_Element;
		@FindBy(how = How.CSS,using = "li[style='font-size: 16px']") List<WebElement> all_checkbox_Element;
		@FindBy(how = How.CSS,using = "input[type='checkbox']") WebElement verify_checkbox_Element;
		
	   
		
	
	public void clickSingleItemCheckBox() throws InterruptedException {
		List<WebElement> checkbox =  all_checkbox_Element;
		System.out.println("Total no of Checkboxes before deleting: " + checkbox.size());
		int  SavingCount=checkbox.size();
		Thread.sleep(3000);
	
	//select the last checkbox...
		
	  for(int i=SavingCount-1;i<SavingCount;i++) {
			 driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i+1) + "]")).click();
     }
	 
	 //Select first Check box
		/*
		 * for(int i=0;i<checkb1;i++) { if(i<1) {
		 * driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i+1) +
		 * "]")).click(); } }
		 */
	 


		
//		  boolean b=single_item_element.isSelected();
//		  System.out.println("Is checkbox is selected: "+b);
//		  
//		  if(b==true) { System.out.println("single item is selected"); } if(!b) {
//		  System.out.println("single item is not selected"); 
//		  
//		  }
//		  
}
		 
	

	public void clickRemoveButton() {
	remove_button_Element.click();
	List<WebElement> checkbox = all_checkbox_Element;
	System.out.println("Single list item is removed");
	System.out.println("Total no of Checkboxes before deleting: " + checkbox.size());
	
  

  }	
}
