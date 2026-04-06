package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTripSearchResultPage {

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    public ClearTripSearchResultPage(WebDriver driver) {
       
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class, 'sc-aXZVg dC')]//div[@class='sc-aXZVg']")
    private List<WebElement> bookNowButton;

    public boolean checkingBookNow() {
    	wait.until(ExpectedConditions.visibilityOfAllElements(bookNowButton));
    	
    	return bookNowButton.size()>0;
    }
}
