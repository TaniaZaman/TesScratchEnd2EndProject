package testCasesE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class GetElementFromCatagoriesList extends BaseTestE {
	
public void getvalue() {
	
	Select catagory = new Select(driver.findElement(By.cssSelector("#gh-cat")));
	
	List<WebElement> item = catagory.getOptions();
	System.out.println( item.size());
	
	
	for(WebElement  list:item) {
		System.out.println(list.getText());
		
	}
		
}

}
