package org.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.utilities.GTHomePagePOJO;

public class Ques3_5 extends GTHomePagePOJO{
public static void main(String[] args) {
	
	launchChrome();
	winMax();
	launchUrl("http://www.greenstechnologys.com/");
	
	Ques3_5 q=new Ques3_5();
	
	btnClick(q.getCertifications()); waitsec(2);
	btnClick(q.getTestimonials());
	waitsec(2);
	
	scrollDown(q.getLastlinenote5());
	
	WebElement printlastline = q.getLastlinenote5();
	
	String text = printlastline.getText();
	String substring = text.substring(text.indexOf("This "), text.indexOf("team"));
	System.out.println(substring);
	
	closeBrowser();
}
}
