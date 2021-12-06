package org.pageobjectmodel;

import org.utilities.BaseClass;
import org.utilities.GTHomePagePOJO;

public class Ques3_3 extends BaseClass{

	public static void main(String[] args) {
		
		launchChrome();
		winMax();
		launchUrl("http://www.greenstechnologys.com/");
		GTHomePagePOJO g=new GTHomePagePOJO();
		
		mouseOver(g.getCourses());
		mouseOver(g.getJavatrain());
		mouseOver(g.getJavacoretrain());
		btnClick(g.getJavacoretrain());
		waitsec(2);
		printText(g.getPrintnote3());
		closeBrowser();
	}
}
