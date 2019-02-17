package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserAbleToClickOnLoginButton {
	@Test
	public void userAbleToValidateLogInButton() throws InterruptedException {
		String baseDir = System.getProperty("user.dir");
		String ChromeDir = System.setProperty("webdriver.chrome.driver", baseDir + "\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.td.com/us/en/personal-banking/");
		Thread.sleep(2000);
		
		
		WebElement login;
		login = driver.findElement(By.cssSelector(".td-buttonlarge.td-copy-nowrap.loginout"));
		login.click();
		
	}

	 
	}



