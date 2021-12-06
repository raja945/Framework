package org.datadriven;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class Ques11 extends BaseClass{
public static void main(String[] args) throws IOException, AWTException {
	launchChrome();
	launchUrl("https://my.naukri.com/account/register/basicdetails");
	winMax();
	WebElement fresherBtn = locateWebelement(By.xpath("//button[@title='I am a Fresher']"));
	
	btnClick(fresherBtn);
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	WebElement name = locateWebelement(By.id("fname"));
	WebElement email = locateWebelement(By.id("email"));
	WebElement pass = locateWebelement(By.name("password"));
	WebElement number = locateWebelement(By.name("number"));
	WebElement city = locateWebelement(By.xpath("(//input[@placeholder='Tell us about your current city'])[1]"));
	
	insertValues(name, getExcelData("naukri_login_details", 1, 0));
	insertValues(email, getExcelData("naukri_login_details", 1, 1));
	insertValues(pass, getExcelData("naukri_login_details", 1, 2));
	insertValues(number, getExcelData("naukri_login_details", 1, 3));
	insertValues(city, getExcelData("naukri_login_details", 1, 4));
	downKey();
	enterKey();
	
	
	WebElement reg = locateWebelement(By.xpath("(//button[@type='submit'])[1]"));
	btnClick(reg);
	//closeBrowser();
}
}
