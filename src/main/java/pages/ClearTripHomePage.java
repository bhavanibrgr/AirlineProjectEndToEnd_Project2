package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTripHomePage {

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    public ClearTripHomePage(WebDriver driver) {
       
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[name()='svg' and @data-testid='closeIcon']")
    private WebElement closeIcon;

    public void clickingOnCloseIcon() {
    	wait.until(ExpectedConditions.elementToBeClickable(closeIcon));
        closeIcon.click();
    }
    @FindBy(css=".closeit")
    private WebElement closeCookiesIcon;
    
    public void closingCookie() {
    	wait.until(ExpectedConditions.elementToBeClickable(closeCookiesIcon));
    	closeCookiesIcon.click();
    }
    @FindBy(xpath="//input[@placeholder='Where from?']")
    private WebElement clickingOnWhereFrom;
    
    public void whereFromClick() {
    	wait.until(ExpectedConditions.elementToBeClickable(clickingOnWhereFrom));
    	clickingOnWhereFrom.click();
    }
    @FindBy(xpath="//div[contains(@class, 'dropdown p-absolute')]/ul")
    private List<WebElement> selectingFromPlace;
    
    public void fromPlaceSelect() {
    	wait.until(ExpectedConditions.visibilityOfAllElements(selectingFromPlace));
    	selectingFromPlace.get(0).click();
    }
    @FindBy(xpath="//input[@placeholder='Where to?']")
    private WebElement clickingOnWhereTo;
    
    public void whereToClick() {
    	wait.until(ExpectedConditions.elementToBeClickable(clickingOnWhereTo));
    	clickingOnWhereTo.click();
    }
    @FindBy(xpath="//div[contains(@class, 'dropdown p-absolute')]/ul")
    private List<WebElement> selectingToPlace;
    
    public void toPlaceSelect() {
    	wait.until(ExpectedConditions.visibilityOfAllElements(selectingToPlace));
    	selectingToPlace.get(4).click();
    }
    @FindBy(xpath="//div[@data-testid='dateSelectOnward']")
    private WebElement dateSelect;
    
    public void selectDate() {
    	wait.until(ExpectedConditions.elementToBeClickable(dateSelect));
    	dateSelect.click();
    }
    @FindBy(xpath="(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Week']//div[@class='DayPicker-Day']")
    private List<WebElement> daySelect;
    
    public void selectingDay() {
    	wait.until(ExpectedConditions.visibilityOfAllElements(daySelect));
    	daySelect.get(10).click();
    }
    
    @FindBy(xpath="//span[text()='Return']")
    private WebElement returnClick;
    
    public void clickingOnReturn() {
    	wait.until(ExpectedConditions.elementToBeClickable(returnClick));
    	returnClick.click();
    }
    
    @FindBy(xpath="(//div[@class='DayPicker-Body'])[2]//div[@class='DayPicker-Week']//div[@class='DayPicker-Day']")
    private List<WebElement> returndaySelect;
    
    public void selectingDayReturn() {
    	wait.until(ExpectedConditions.visibilityOfAllElements(returndaySelect));
    	returndaySelect.get(10).click();
    }
    @FindBy(xpath="//h4[text()='Search flights']")
    private WebElement searchFlights;
    
    public void clickingOnSearchFlights() {
    	wait.until(ExpectedConditions.elementToBeClickable(searchFlights));
    	searchFlights.click();
    }
    
}
