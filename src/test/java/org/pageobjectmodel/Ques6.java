package org.pageobjectmodel;

import java.io.IOException;

import org.adactinPOJO.BookHotelPage;
import org.adactinPOJO.LoginPage;
import org.adactinPOJO.SearchHotelPage;
import org.adactinPOJO.SelectHotelPage;
import org.utilities.BaseClass;

public class Ques6 extends  BaseClass{
	public static void main(String[] args) throws IOException {
		launchChrome();
		winMax();
		launchUrl("http://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		
		insertValues(l.getUsrnme(), getExcelData("adactin_login_details", 1, 0));
		insertValues(l.getPasswd(), getExcelData("adactin_login_details", 1, 1));
		btnClick(l.getLoginbtn());
		waitsec(2);
		
		SearchHotelPage s=new SearchHotelPage();
		selectValue(s.getLoc(), getExcelData("adactin_login_details",1,2));
		selectValue(s.getHotel(), getExcelData("adactin_login_details",1,3));
		selectValue(s.getRoomtype(), getExcelData("adactin_login_details",1,4));
		selectValue(s.getRoomnos(), getExcelData("adactin_login_details",1,5));
//		selectValue(s.getChkin(), getExcelData("adactin_login_details",1,6));
//		selectValue(s.getChkout(), getExcelData("adactin_login_details",1,7));
		selectValue(s.getAdultrm(), getExcelData("adactin_login_details",1,8));
		selectValue(s.getChildrm(), getExcelData("adactin_login_details",1,9));
		btnClick(s.getSubmitBtn());
		waitsec(2);
		
		SelectHotelPage sl=new SelectHotelPage();
		btnClick(sl.getSelectHotel());
		btnClick(sl.getCont());
		waitsec(2);
		
		BookHotelPage b=new BookHotelPage();
		insertValues(b.getFirstnm(), getExcelData("adactin_login_details", 1, 10));
		insertValues(b.getLastnm(), getExcelData("adactin_login_details", 1, 11));
		insertValues(b.getAddress(), getExcelData("adactin_login_details", 1, 12));
		insertValues(b.getCc_num(), getExcelData("adactin_login_details", 1, 13));
		insertValues(b.getCc_type(), getExcelData("adactin_login_details", 1, 14));
		insertValues(b.getCc_exp_month(), getExcelData("adactin_login_details", 1, 15));
		insertValues(b.getCc_exp_year(), getExcelData("adactin_login_details", 1, 16));
		insertValues(b.getCc_cvv(), getExcelData("adactin_login_details", 1, 17));
	
		btnClick(b.getBook_now());
		waitsec(2);
		
		printAttribute(b.getOrder_no(), "value");
		waitsec(2);
		btnClick(b.getLogoutbtn());
		waitsec(2);
		closeBrowser();
	}
}
