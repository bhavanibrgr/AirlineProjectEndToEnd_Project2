package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.ListenersLogic;


public class BaseClass extends ListenersLogic{
	
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void launchBrowser(String browser, String url) {
		
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
		if(browser.equals("edge"))
			driver=new EdgeDriver();
		if(browser.equals("firefox"))
			driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		
		}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
				driver.quit();
	}
	}




