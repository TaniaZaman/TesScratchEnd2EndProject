package testPageE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageE {
public WebDriver driver;

public BasePageE(WebDriver driver) {
   this.driver = driver;
	this.inItPage();
	
}

private void inItPage() {
	PageFactory.initElements(driver, this);
	
	
}
}
