package org.pageobjectmodel;

import java.io.IOException;

import org.utilities.BaseClass;
import org.utilities.FacebookLoginPage;

public class Ques1 extends BaseClass{
public static void main(String[] args) throws IOException {
	launchChrome();
	winMax();
	launchUrl("https://en-gb.facebook.com");
	FacebookLoginPage l=new FacebookLoginPage();
	
	insertValues(l.getUsrname(), getExcelData("facebook_login_details", 1, 0));
	insertValues(l.getPasswd(), getExcelData("facebook_login_details", 1, 1));
	btnClick(l.getLogin());
}
}
