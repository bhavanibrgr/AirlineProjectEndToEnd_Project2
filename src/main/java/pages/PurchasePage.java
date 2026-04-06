package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchasePage {

	 WebDriver driver;
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    public PurchasePage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "inputName")
	    private WebElement name;

	    @FindBy(id = "address")
	    private WebElement address;

	    @FindBy(id = "city")
	    private WebElement city;

	    @FindBy(id = "state")
	    private WebElement state;

	    @FindBy(id = "zipCode")
	    private WebElement zipCode;

	    @FindBy(id = "cardType")
	    private WebElement cardType;

	    @FindBy(id = "creditCardNumber")
	    private WebElement cardNumber;

	    @FindBy(id = "creditCardMonth")
	    private WebElement month;

	    @FindBy(id = "creditCardYear")
	    private WebElement year;

	    @FindBy(id = "nameOnCard")
	    private WebElement nameOnCard;

	    @FindBy(xpath = "//input[@value='Purchase Flight']")
	    private WebElement purchaseBtn;

	    // METHODS
	    public void enterName(String n) {
	    	wait.until(ExpectedConditions.visibilityOf(name));
	    	name.sendKeys(n);
	    }

	    public void enterAddress(String addr) {
	    	wait.until(ExpectedConditions.visibilityOf(address));
	        address.sendKeys(addr);
	    }

	    public void enterCity(String c) {
	    	wait.until(ExpectedConditions.visibilityOf(city));
	        city.sendKeys(c);
	    }

	    public void enterState(String s) {
	    	wait.until(ExpectedConditions.visibilityOf(state));
	        state.sendKeys(s);
	    }

	    public void enterZip(String zip) {
	    	wait.until(ExpectedConditions.visibilityOf(zipCode));
	        zipCode.sendKeys(zip);
	    }

	    public void enterCardNumber(String card) {
	    	wait.until(ExpectedConditions.visibilityOf(cardNumber));
	        cardNumber.sendKeys(card);
	    }

	    public void enterNameOnCard(String cardName) {
	    	wait.until(ExpectedConditions.visibilityOf(nameOnCard));
	        nameOnCard.sendKeys(cardName);
	    }

	    public void clickPurchase() {
	    	wait.until(ExpectedConditions.elementToBeClickable(purchaseBtn));
	        purchaseBtn.click();
	    }

	    //FULL FLOW METHOD
	    public void completePurchase(String n, String addr, String c, String s, String zip, String card, String cardName) {

	        enterName(n);
	        enterAddress(addr);
	        enterCity(c);
	        enterState(s);
	        enterZip(zip);
	        enterCardNumber(card);
	        enterNameOnCard(cardName);
	        clickPurchase();
	    }
}
