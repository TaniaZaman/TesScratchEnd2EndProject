package testCases;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class UserAbleToValidateUserInputField extends BaseTest {
//public static void main(String[] args) throws InterruptedException {
	
	

	@Test
	public void userAbleToValidateUserInputField() throws InterruptedException {
	
    // driver.findElement(By.cssSelector("#main > div.a-login-banner > div.a-login-banner-loginbox > section > div > div > div > div.hidden-xs.hidden-sm.td-col-md-6.td-col-md-offset-0.td-col-lg-5.td-col-lg-offset-1 > div > div:nth-child(2) > div.td-col-md-7.td-col-md-offset-2 > button")).click();
	//Thread.sleep(2000);
	
	WebElement SearchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	if(SearchBox.isEnabled()&& SearchBox.isDisplayed()){
		SearchBox.clear();
		SearchBox.sendKeys("iPhone");
		SearchBox.submit();
	}else {
		System.out.println("SearchBox is invalid");
	}
	
	Thread.sleep(2000);
	
	
	
	
	 
     
}
}
