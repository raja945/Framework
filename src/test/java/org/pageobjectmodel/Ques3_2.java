package org.pageobjectmodel;

import org.utilities.BaseClass;
import org.utilities.GTHomePagePOJO;

public class Ques3_2 extends BaseClass {
public static void main(String[] args) {
	
	launchChrome();
	winMax();
	launchUrl("http://www.greenstechnologys.com/");
	GTHomePagePOJO g=new GTHomePagePOJO();
	
	btnClick(g.getCertifications());
	btnClick(g.getSeleniumcourse());
	
	waitsec(2);
	printText(g.getPrintseleHead());
	printText(g.getPrintselepara());
	
	closeBrowser();
}
}
