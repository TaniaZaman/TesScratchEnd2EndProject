package testCasesE;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testPageE.AddToCartPage;
import testPageE.EbayHomePage;
import testPageE.LadiesWatchPage;

public class UserAbleToAddToCart extends BaseTestE{

	@Test
	public void userAbleToAddToCart() throws InterruptedException {
		EbayHomePage ehp = new EbayHomePage(driver);
		LadiesWatchPage lwp = new LadiesWatchPage(driver);
		AddToCartPage acp = new AddToCartPage(driver);
		
		if(ehp.getSearchBox().isDisplayed()&& ehp.getSearchBox().isEnabled()) {
			ehp.getSearchBox().clear();
			ehp.getSearchBox().sendKeys("ladies watch");
		}else {
			System.out.println("Search is invalid");
		}
		
		ehp.enterSearchButton().submit();
		lwp.getShopNow().click();
		acp.getAddToCart().click();
		Select s = new Select(ehp.getCategoryDropDown());
		System.out.println(s.getOptions().size());
		for(WebElement ele:s.getOptions()) {
		System.out.println(ele.getText());
		}
		
		Thread.sleep(2000);
	}
}
