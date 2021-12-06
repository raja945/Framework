package org.datadriven;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class Ques7 extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		launchUrl("https://www.facebook.com/");
		WebElement txtuser = locateWebelement(By.id("email"));
		WebElement txtpass = locateWebelement(By.id("pass"));
		WebElement clicklogin = locateWebelement(By.name("login"));
		
		String title = driver.getTitle();
		
		insertValues(txtuser, getExcelData("fb_login_details", 1, 0));
		insertValues(txtpass, getExcelData("fb_login_details", 1, 1));
		
		System.out.println(txtuser.getAttribute("value"));
		System.out.println(txtpass.getAttribute("value"));
		
		btnClick(clicklogin);
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		
		if (title1.equals(title)) {
			insertCellValue("fb_login_details", 1, 2, "fail");
		}
		else {
			insertCellValue("fb_login_details", 1, 2, "pass");
		}
		
		
		closeBrowser();
	}
}
