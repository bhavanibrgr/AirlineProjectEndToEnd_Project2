package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.ClearTripHomePage;
import pages.ClearTripSearchResultPage;
import utility.ListenersLogic;
import utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class ClearTripTestClass extends BaseClass{

	@Test(retryAnalyzer = RetryLogic.class)
	public void dateSelectionForBooking_Return() {
		ClearTripHomePage ct=new ClearTripHomePage(driver);
		ct.clickingOnCloseIcon();
		ct.closingCookie();
		ct.whereFromClick();
		ct.fromPlaceSelect();
		ct.whereToClick();
		ct.toPlaceSelect();
		ct.selectDate();
		ct.selectingDay();
		ct.clickingOnReturn();
		ct.selectingDayReturn();
		ct.clickingOnSearchFlights();
		
		ClearTripSearchResultPage search=new ClearTripSearchResultPage(driver);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(search.checkingBookNow(), "Assertion failed as the Book now button is not there");
		sa.assertAll();
	}
}
