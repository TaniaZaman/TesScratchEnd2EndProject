package testCasesE;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VerifyingValueFromCatagoryList extends BaseTestE{
	
	@SuppressWarnings("deprecation")
	@Test
	public void verifedValueL() {
		String err[] = {"All Categories","Antiques","Art","Baby","Books","Business & Industrial","Cameras & Photo","Cell Phones & Accessories","Clothing, Shoes & Accessories","Coins & Paper Money","Collectibles","Computers/Tablets & Networking","Consumer Electronics","Crafts","Dolls & Bears","DVDs & Movies","eBay Motors","Entertainment Memorabilia","Gift Cards & Coupons", "Health & Beauty","Home & Garden","Jewelry & Watches","Music","Musical Instruments & Gear","Pet Supplies","Pottery & Glass","Real Estate","Specialty Services","Sporting Goods","Sports Mem, Cards & Fan Shop","Stamps","Tickets & Experiences","Toys & Hobbies","Travel","Video Games & Consoles","Everything Else"};

		Select catagory = new Select(driver.findElement(By.cssSelector("#gh-cat")));
		
		List<WebElement> item = catagory.getOptions();
		System.out.println( item.size());
		
		for(int i=0; i<item.size();i++) {
	Assert.assertEquals(err[i], item.get(i).getText());
			
		}
		System.out.println("verification is succesfull");
	}
		


}
