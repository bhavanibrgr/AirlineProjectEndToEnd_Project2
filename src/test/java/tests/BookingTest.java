package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.ConfirmationPage;
import pages.FlightsPage;
import pages.HomePage;
import pages.PurchasePage;
import utility.DataProviderClass;
import utility.ListenersLogic;

@Listeners(ListenersLogic.class)
public class BookingTest extends BaseClass {

		 @Test(dataProvider = "bookingData", dataProviderClass = DataProviderClass.class)
		    public void completeBookingTest(
		            String fromCity,
		            String toCity,
		            String name,
		            String address,
		            String city,
		            String state,
		            String zip,
		            String cardNumber,
		            String cardName) {

		        HomePage home = new HomePage(driver);
		        home.searchFlight(fromCity, toCity);

		        FlightsPage flights = new FlightsPage(driver);
		        flights.chooseFirstFlight();

		        PurchasePage purchase = new PurchasePage(driver);
		        purchase.completePurchase(
		                name, address, city, state, zip, cardNumber, cardName);

		        ConfirmationPage confirm = new ConfirmationPage(driver);

		        Assert.assertTrue(confirm.getConfirmationText().contains("Thank you"));
		    }
}

