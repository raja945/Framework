package org.pageobjectmodel;

import org.utilities.BaseClass;
import org.utilities.GTHomePagePOJO;

public class Ques3_1 extends BaseClass {
public static void main(String[] args) {
	
	launchChrome();
	winMax();
	launchUrl("http://www.greenstechnologys.com/index.html");
	GTHomePagePOJO g=new GTHomePagePOJO();
	
	scrollDown(g.getLastlinenote1());
	printText(g.getLastlinenote1());
	scrollUp(g.getFirstlinenote1());
	printText(g.getFirstlinenote1());
	
	closeBrowser();
}
}
