package org.pageobjectmodel;

import org.utilities.BaseClass;
import org.utilities.GTHomePagePOJO;

public class Ques3_4 extends BaseClass{
public static void main(String[] args) {
	
	launchChrome();
	winMax();
	launchUrl("http://www.greenstechnologys.com/");
	
	GTHomePagePOJO g=new GTHomePagePOJO();
	btnClick(g.getContactus());
	waitsec(2);
	btnClick(g.getCareers()); 
	waitsec(3);
	
	scrollDown(g.getScrolldownnote4());
	printText(g.getPrintnote4());
	closeBrowser();
}
}
