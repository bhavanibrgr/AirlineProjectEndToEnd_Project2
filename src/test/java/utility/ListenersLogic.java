package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener {
      public static WebDriver driver;
      String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	@Override
	public void onTestSuccess(ITestResult result) {
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("screenshots/pass/"+result.getName()+"_"+timestamp+".png");
		 try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File source=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("/screenshots/fail/"+result.getName()+timestamp+".png");
		 try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		ITestListener.super.onTestFailure(result);
	}

   

    
}
