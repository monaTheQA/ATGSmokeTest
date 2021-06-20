package com.ATG.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.ATG.Pages.HomePage;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.util.Assert;

public class CreateCoupon extends BaseTest {
	@Test
	public void createCoupon() throws InterruptedException
	{
		reportUtils.createATestCase("createCoupon");
		reportUtils.addTestLog(Status.INFO, "performingLog");
		HomePage homePage = new HomePage(driver);
		
		
		
		homePage.acceptAlertCookies();
		homePage.clickOnSpelaLink();
		homePage.scrolDown();
		homePage.clickOnV4Link();
		homePage.clickOnV41Btn();
		homePage.clickOnV42Btn();
		homePage.clickOnV43Btn();
		homePage.clickOnV4AllBtn();
		homePage.clickOnNewCouponBtn();
		homePage.clickOnBlankCouponBtn();
		//homePage.clickOnHastLink();		
		//String actualResult = commonDriver.getTilte();
		//String expectedResult ="ATG";
		
		//Assert.assertEquals(actualResult, expectedResult);
		
	}

}
