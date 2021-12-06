package org.java_unit;

import java.awt.AWTException;
import java.io.IOException;
import org.adactinPOJO.BookHotelPage;
import org.adactinPOJO.LoginPage;
import org.adactinPOJO.SearchHotelPage;
import org.adactinPOJO.SelectHotelPage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;

public class Ques8 extends BaseClass{

	@BeforeClass
	public static void launchBrowser() {
		launchChrome();
		winMax();
		deleteCookies();
	}
	@AfterClass
	public static void quitBrowser() {
		closeBrowser();
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
	public void tc1() throws IOException {
		launchUrl("http://www.adactin.com/HotelApp");
		LoginPage l=new LoginPage();
		insertValues(l.getUsrnme(), getExcelData("adactin_login_details", 1, 0));
		insertValues(l.getPasswd(), getExcelData("adactin_login_details", 1, 1));
		btnClick(l.getLoginbtn());
		waitsec(2);
	}
	@Test
	public void tc2() throws IOException, AWTException, InterruptedException {
		SearchHotelPage s=new SearchHotelPage();
		selectValue(s.getLoc(), getExcelData("adactin_login_details", 1, 2));
		selectValue(s.getHotel(), getExcelData("adactin_login_details", 1, 3));
		selectValue(s.getRoomtype(), getExcelData("adactin_login_details", 1, 4));
		selectValue(s.getRoomnos(), getExcelData("adactin_login_details", 1, 5));
		
		clearText(s.getChkin());
		jsInsertvalue(s.getChkin(), "20/10/2021");
		clearText(s.getChkout());
		btnClick(s.getChkin());selectAll();deleteKey();
		jsInsertvalue(s.getChkout(), "22/10/2021");
		
		selectValue(s.getAdultrm(), getExcelData("adactin_login_details", 1, 8));
		selectValue(s.getChildrm(), getExcelData("adactin_login_details", 1, 9));
		btnClick(s.getSubmitBtn());
		waitsec(2);
	}
	@Test
	public void tc3() {
		SelectHotelPage sl=new SelectHotelPage();
		btnClick(sl.getSelectHotel());
		btnClick(sl.getCont());
		waitsec(2);
	}
	@Test
	public void tc4() throws IOException, InterruptedException {
		BookHotelPage b=new BookHotelPage();
		insertValues(b.getFirstnm(), getExcelData("adactin_login_details", 1, 10));
		insertValues(b.getLastnm(), getExcelData("adactin_login_details", 1, 11));
		insertValues(b.getAddress(), getExcelData("adactin_login_details", 1, 12));
		insertValues(b.getCc_num(), getExcelData("adactin_login_details", 1, 13));
		selectVisbleText(b.getCc_type(), getExcelData("adactin_login_details", 1, 14));
		selectVisbleText(b.getCc_exp_month(), getExcelData("adactin_login_details", 1, 15));
		selectVisbleText(b.getCc_exp_year(), getExcelData("adactin_login_details", 1, 16));
		insertValues(b.getCc_cvv(), getExcelData("adactin_login_details", 1, 17));
		btnClick(b.getBook_now());
		//waitsec(2)
		Thread.sleep(4000);
	}
	@Test
	public void tc5() {
		BookHotelPage b=new BookHotelPage();
		System.out.print("Order No: ");
		printAttribute(b.getOrder_no(), "value");
	}
	
}
