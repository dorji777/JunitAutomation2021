package page;

import java.util.Random;

public class BasePage {

	public int generateRandomNum(int i) {
		
		Random rn = new Random();
		
		int generatedNum= rn.nextInt(999);
		return generatedNum;
		
	}
		
}
