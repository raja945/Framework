package org.datadriven;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class Ques10 extends BaseClass {
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	launchChrome();
	launchUrl("http://adactinhotelapp.com/");
	winMax();
	pageTitle();
	WebElement txtuser = locateWebelement(By.id("username"));
	WebElement txtpass = locateWebelement(By.id("password"));
	
	insertValues(txtuser, getExcelData("adactin_login_details", 1, 0));
	insertValues(txtpass, getExcelData("adactin_login_details", 1, 1));
	
	WebElement login = locateWebelement(By.id("login"));
	btnClick(login);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	
	pageTitle();
	WebElement location = locateWebelement(By.id("location"));
	selectValue(location, getExcelData("adactin_login_details",1,2) );
	
	WebElement hotel = locateWebelement(By.id("hotels"));
	selectValue(hotel, getExcelData("adactin_login_details",1,3));
	
	WebElement roomtype = locateWebelement(By.id("room_type"));
	selectValue(roomtype, getExcelData("adactin_login_details", 1, 4));
	
	WebElement roomnos = locateWebelement(By.id("room_nos"));
	selectValue(roomnos, getExcelData("adactin_login_details", 1, 5));
	
//	WebElement chkin = locateWebelement(By.name("datepick_in"));
//	btnClick(chkin);selectAll();deleteKey();
//	jsInsertvalue(chkin, getExcelData("adactin_login_details", 1, 6));
//	
//	WebElement chkout = locateWebelement(By.id("datepick_out"));
//	btnClick(chkin);selectAll();deleteKey();
//	jsInsertvalue(chkout, getExcelData("adactin_login_details", 1, 7));
	
	
	WebElement adultroom = locateWebelement(By.id("adult_room"));
	selectValue(adultroom, getExcelData("adactin_login_details", 1, 8));
	
	WebElement childroom = locateWebelement(By.id("child_room"));
	selectValue(childroom, getExcelData("adactin_login_details", 1, 9));
	
	btnClick(locateWebelement(By.id("Submit")));
	//waitsec(2);
	
	pageTitle();
	btnClick(locateWebelement(By.id("radiobutton_0")));
	btnClick(locateWebelement(By.id("continue")));
	//waitsec(2);
	
	pageTitle();
	insertValues(locateWebelement(By.name("first_name")), getExcelData("adactin_login_details", 1, 10));
	insertValues(locateWebelement(By.name("last_name")), getExcelData("adactin_login_details", 1, 11));
	insertValues(locateWebelement(By.name("address")), getExcelData("adactin_login_details", 1, 12));
	insertValues(locateWebelement(By.name("cc_num")), getExcelData("adactin_login_details", 1, 13));
	insertValues(locateWebelement(By.name("cc_type")), getExcelData("adactin_login_details", 1, 14));
	insertValues(locateWebelement(By.name("cc_exp_month")), getExcelData("adactin_login_details", 1, 15));
	insertValues(locateWebelement(By.name("cc_exp_year")), getExcelData("adactin_login_details", 1, 16));
	insertValues(locateWebelement(By.name("cc_cvv")), getExcelData("adactin_login_details", 1, 17));
	
	btnClick(locateWebelement(By.id("book_now")));
	//waitsec(5);
	
	pageTitle();
	WebElement orderno = locateWebelement(By.name("order_no"));
	
	printAttribute(orderno, "value");
	closeBrowser();
	
}}
