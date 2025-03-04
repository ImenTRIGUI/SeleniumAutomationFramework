package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		Log.info("Starting login test...");
		LoginPage loginPage = new LoginPage(driver);
		
		
		Log.info("Adding credentials");
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
		String expectedMessage = "Un instant…"; 
		String actualMessage = driver.getTitle();

		System.out.println("The title of the page is: "+ driver.getTitle());
		Log.info("Verifying page title");
		
		Assert.assertEquals(actualMessage, expectedMessage, "The title of the page not correct");
	}

}
