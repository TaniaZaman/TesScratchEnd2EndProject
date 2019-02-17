package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	 public   WebDriver driver;
	String expectedURL = ("https://www.amazon.com/" ) ;
	
	@BeforeClass
	public void beforeClass() {
		String Basedir = System.getProperty("user.dir");
		String ChormeDir = Basedir + ("\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChormeDir);
		 driver = new ChromeDriver();	
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException  {
		driver.get("https://www.amazon.com/" );
		
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals( expectedURL, currentURL );
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
