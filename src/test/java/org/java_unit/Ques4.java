package org.java_unit;


import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.FlipkartLoginPage;

public class Ques4 extends BaseClass{
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		winMax();
	}
	
	@AfterClass
	public static void quitBrowser() {
		closeBrowser();
	}
	
	@Before
	public  void startTime() {
		printDateAndTime();
	}
	@After
	public  void endTime() {
		printDateAndTime();
	}
	
	@Test
	public void tc1() throws IOException, InterruptedException {
		launchUrl("https://www.flipkart.com/account/login");
		String loginPageTitle = pageTitle();
		FlipkartLoginPage f=new FlipkartLoginPage();
		
		insertValues(f.getUsrname(), getExcelData("flipkart_det", 1, 0));
		insertValues(f.getPassword(), getExcelData("flipkart_det", 1, 1));
		btnClick(f.getLogin());
		//waitsec(30);//doubt
		Thread.sleep(1000);
		String homePageTitle = pageTitle();
		
		if (!loginPageTitle.equals(homePageTitle)) {
			System.out.println("Login Successful"+"\n"+"The entered credentials are correct!");
		}else {
			System.out.println("Login Unsuccessful"+"\n"+"The entered credentials are not correct!Pls Check");
		}
		
	}
}
