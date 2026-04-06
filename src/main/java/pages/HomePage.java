package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "fromPort")
    private WebElement fromCityDropdown;

    @FindBy(name = "toPort")
    private WebElement toCityDropdown;

    @FindBy(xpath = "//input[@value='Find Flights']")
    private WebElement findFlightsBtn;

    // METHODS
    public void selectFromCity(String fromCity) {
    	wait.until(ExpectedConditions.visibilityOf(fromCityDropdown));
        fromCityDropdown.sendKeys(fromCity);
    }

    public void selectToCity(String toCity) {
    	wait.until(ExpectedConditions.visibilityOf(toCityDropdown));
        toCityDropdown.sendKeys(toCity);
    }

    public void clickFindFlights() {
    	wait.until(ExpectedConditions.visibilityOf(findFlightsBtn));
        findFlightsBtn.click();
    }

    public void searchFlight(String from, String to) {
        selectFromCity(from);       
        selectToCity(to);
        clickFindFlights();
    }
}
