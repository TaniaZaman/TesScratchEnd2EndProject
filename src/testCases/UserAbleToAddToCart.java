package testCases;
import org.testng.annotations.Test;

import testPages.AmazonHomePage;
import testPages.HeaderElements;
import testPages.IphonePage;


	public class UserAbleToAddToCart extends BaseTest {
		//public static void main(String[] args) throws InterruptedException {
			
			

			@Test
			public void userAbleToAddToCart() throws InterruptedException {
			AmazonHomePage ahp = new AmazonHomePage(driver);
			IphonePage ip = new IphonePage(driver);
			HeaderElements he = new HeaderElements(driver);
			
			if(ahp.getSearchBox().isEnabled() && ahp.getSearchBox().isDisplayed()){
				ahp.getSearchBox().clear();
				ahp.getSearchBox().sendKeys("iphone");
				
			}else {
				System.out.println("SearchBox is invalid");
			}
			ahp.getSubmit().submit();
			ip.getShopNow().click();;
			he.getAddToCart().click();;
			
			Thread.sleep(2000);
			
			
			
			
			 
		     
		}
		}


