package testCasesE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestE {
	WebDriver driver;
	String expectedURL = "https://www.ebay.com/";
	
	@BeforeClass
	public void beforeClass() {
		String baseDir = System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver", baseDir + "\\driver\\chromedriver.exe");
	driver = new ChromeDriver();	
		
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.ebay.com/");
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, currentURL);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test case is done");
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.close();
		
	}
	
	

}
