package org.pageobjectmodel;

import org.utilities.GTHomePagePOJO;

public class Ques3_6 extends GTHomePagePOJO {
public static void main(String[] args) {
	
	launchChrome();
	winMax();
	launchUrl("http://www.greenstechnologys.com/");
	
	GTHomePagePOJO g=new GTHomePagePOJO();
	
	btnClick(g.getContactus());
	waitsec(2);
	
	printText(g.getFirstlinenote6());
	
	scrollDown(g.getLastlinenote6());
	
	printText(g.getLastlinenote6());
	closeBrowser();
}
}