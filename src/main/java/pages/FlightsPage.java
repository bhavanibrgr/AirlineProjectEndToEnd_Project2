package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {

	 WebDriver driver;
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	    public FlightsPage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "(//input[@value='Choose This Flight'])[1]")
	    private WebElement firstFlight;

	    public void chooseFirstFlight() {
	    	wait.until(ExpectedConditions.elementToBeClickable(firstFlight));
	        firstFlight.click();
	    }
}
