package testPageE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EbayHomePage extends BasePageE{
	
	public EbayHomePage(WebDriver driver) {
		super(driver);}
		@FindBy(css="#gh-ac") 
		public WebElement Searchbox;
		
		public WebElement getSearchBox() {
			return Searchbox;
	}

		@FindBy(css="#gh-btn")
		public WebElement searchButton;
		
		public WebElement enterSearchButton() {
			return searchButton;
		
		
		}
		@FindBy(css = "#gh-cat")

		public WebElement categoryDropDown;



		public WebElement getCategoryDropDown() {

			return categoryDropDown;

		}



	
	

		

		}
		
		

