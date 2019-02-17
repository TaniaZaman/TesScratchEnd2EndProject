package testPageE;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LadiesWatchPage extends BasePageE{
	
	public LadiesWatchPage(WebDriver driver) {
	
		super(driver);}
		
		@FindBy(css="body.s-page.no-touch.skin-large.srp--list-view.no-touch.skin-large.gh-flex:nth-child(2) div.srp-main.srp-main--isLarge:nth-child(8) div.srp-main-content.clearfix.srp-main-content--flex div.s-answer-region.s-answer-region-center-top:nth-child(1) div.x-1p a.srp-1p__link div.srp-1p.srp-1p__banner.srp-1p--large div.srp-1p__details div.srp-1p__ad-column div.srp-1p__cta > div:nth-child(1)")
		public WebElement shopNow;
		
		public WebElement getShopNow() {
			return shopNow;}
		
	

}
