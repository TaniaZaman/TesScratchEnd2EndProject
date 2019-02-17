package testPages;

import org.openqa.selenium.WebDriver;
//collection of all Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {
	public AmazonHomePage(WebDriver driver) {
		super(driver);}
		// TODO Auto-generated constructor stub
	
	@FindBy(css="#twotabsearchtextbox")
	public WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	@FindBy(xpath="//input[@value='Go']")
	public WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}
	
	

}
