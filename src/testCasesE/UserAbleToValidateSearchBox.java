package testCasesE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserAbleToValidateSearchBox extends BaseTestE {
	@Test
	public void userAbleToValidateSearchBox() throws InterruptedException {
		WebElement Searchbox = driver.findElement(By.cssSelector("#gh-ac"));
		
		if(Searchbox.isDisplayed() && Searchbox.isEnabled()) {
			
			Searchbox.sendKeys("ladies Watch");
			Searchbox.submit();
			Thread.sleep(2000);
			
		}
		
	}

}
