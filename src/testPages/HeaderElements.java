package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderElements extends BasePage{
	public HeaderElements(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#nav-cart-count")
	public WebElement addToCart;
	
	public WebElement getAddToCart() {
		return addToCart;
	}

}
