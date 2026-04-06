package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    public ConfirmationPage(WebDriver driver) {
       
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    private WebElement successMsg;

    public String getConfirmationText() {
    	wait.until(ExpectedConditions.visibilityOf(successMsg));
        return successMsg.getText();
    }
}
