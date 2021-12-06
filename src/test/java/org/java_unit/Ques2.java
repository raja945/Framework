package org.java_unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.Redbus_LoginPage;

public class Ques2 extends BaseClass {

	@BeforeClass
	public static void launchBrowser() {
		launchChrome();
		winMax();
	}

	@AfterClass
	public static void quitBrowser() {
		//closeBrowser();
	}

	@Before
	public void startTime() {
		printDateAndTime();
	}

	@After
	public void endTime() {
		printDateAndTime();
	}

	@Test
	public void tc1() {

		launchUrl("https://www.redbus.in/");
		winMax();
	}

	@Test
	public void tc2() {
		Redbus_LoginPage r = new Redbus_LoginPage();
		btnClick(r.getSinginBtn());
		btnClick(r.getSignInLink());
		switchToFrame(r.getSignInFrame());
		waitsec(2);
		btnClick(r.getSignInFb());
		switchWindow(1);
		insertValues(r.getFbUsr(), "ganapathyraja945@gmail.com");
		insertValues(r.getFbPass(), "Pgr.pgr@1");
		btnClick(r.getFbLogin());
		switchWindow(0);
	}

	@Test
	public void tc3() throws InterruptedException {
		
		waitsec(5);
			
			WebElement loc = locateWebelement(By.xpath("//div[@id='sign-in-icon-down']"));
			btnClick(loc);
			
			WebElement signout = locateWebelement(By.xpath("li[@id='signOutLink']"));
			
			if (signout.isDisplayed()) {
				System.out.println("Login Succesful");
			}else {
				System.out.println("dfghjk");
			}
	}

}
