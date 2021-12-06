package org.java_unit;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.DemoQa_LoginPOJO;

public class Ques5 extends BaseClass{

	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		winMax();
	}
	@AfterClass
	public static void quitBrowser() {
		//closeBrowser();
	}
	@Ignore
	@Test
	public void tc1() {
		launchUrl("https://demoqa.com/automation-practice-form");
		DemoQa_LoginPOJO d=new DemoQa_LoginPOJO();
		insertValues(d.getFirstName(), "Ganapathy");
		insertValues(d.getLastName(), "Raja");
		insertValues(d.getUserEmail(), "gnapathy@gmail.com");
		btnClick(d.getMale());
		insertValues(d.getMobNum(), "9876543210");
	}
	
	@Test
	public void tc2() throws AWTException {
		launchUrl("https://demoqa.com/automation-practice-form");
		DemoQa_LoginPOJO d=new DemoQa_LoginPOJO();
		btnClick(d.getDOB());selectAll();
		insertValues(d.getDOB(), "20 Sep 1998");
		enterKey();
		btnClick(d.getCloseAd());
		waitsec(2);
		insertValues(d.getSubject(), "E");enterKey();
		insertValues(d.getSubject(), "C");enterKey();
		
		//scrollDown(d.getSubmit());
	}
	@Ignore
	@Test
	public void tc3() {
		DemoQa_LoginPOJO d=new DemoQa_LoginPOJO();
		scrollDown(d.getSubmit());
		btnClick(d.getSportsHobby());btnClick(d.getReadingHobby());btnClick(d.getMusicHobby());
		insertValues(d.getAddress(), "2/24,sankarlal street,Chrompet");
	}
	@Ignore
	@Test
	public void tc4() throws AWTException {
		DemoQa_LoginPOJO d=new DemoQa_LoginPOJO();
		btnClick(d.getState());
		for (int i = 0; i < 3; i++) {
			downKey();
		}enterKey();
		btnClick(d.getCity());
		downKey();enterKey();
		btnClick(d.getSubmit());
	}
	@Ignore
	@Test
	public void tc5() throws IOException {
		DemoQa_LoginPOJO d=new DemoQa_LoginPOJO();
		scrollDown(d.getGivenDetails());
		takeSnap(d.getGivenDetails(), "demo_qa");
	}
	}

