package testCases;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class UsersGetElementsFromDropDownList extends BaseTest{
	
	 

	public void getDropDownList() {
		
		
		WebElement dropDown = driver.findElement(By.cssSelector("#searchDropdownBox"));
		Select DropdownList = new Select(dropDown);
		
		
		List<WebElement> ddL = DropdownList.getOptions();
		int ddL1 = ddL.size();
		System.out.println("Total DropDownlist is " + ddL1);
		//Enhance/Advance for loop
		for (WebElement ele:ddL) {
			String DropDownLists = ele.getText();
			System.out.println( DropDownLists);
		}
	
	

	}

}
