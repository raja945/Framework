package org.java_unit;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.FacebookLoginPage;


public class Ques1 extends BaseClass{
	@BeforeClass
	public static void browserlaunch() {
		launchChrome();
		winMax();
	}
	@Before
	public  void starttime() {
		Date d=new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() throws IOException {
		FacebookLoginPage f=new FacebookLoginPage();
		String homepageTitle="Facebook";
		launchUrl("http://en-gb.facebook.com");
		pageTitle();
		insertValues(f.getUsrname(), "Greens");
		insertValues(f.getPasswd(), "1234565");
		btnClick(f.getLogin());
		waitsec(2);
		if (homepageTitle.equals(pageTitle())) {
			System.out.println("The Entered Credentials are Correct-Login Successful!");
		}else {
			System.out.println("Login Unsuccessful :(");
			printText(f.getErrormsg());
		}
	}

	@After
	public void endtime() {
		Date d=new Date();
		System.out.println(d);
	}

	@AfterClass
	public static void quitbrowser() {
		closeBrowser();
	}

	}

