package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GTHomePagePOJO extends BaseClass{
	

		public GTHomePagePOJO() {
			PageFactory.initElements(driver, this);
		}
		
		//note1
		@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
		private WebElement firstlinenote1;
		
		@FindBy(xpath="//p[text()='Copyright © 2019 greenstechnologys.com. All Rights Reserved.']")
		private WebElement lastlinenote1;
		
		//note2
		@FindBy(xpath="//a[@href='Certifications.html']")
		private WebElement certifications;
		
		@FindBy(xpath="(//a[@href='selenium-course-content.html'])[1]")
		private WebElement seleniumcourse;
		
		@FindBy(xpath="//Strong[text()='Selenium Training in Chennai']")
		private WebElement printseleHead;
		
		@FindBy(xpath="//p[contains(text(), 'Rated As ')]")
		private WebElement printselepara;
		
		public WebElement getFirstlinenote1() {
			return firstlinenote1;
		}

		public WebElement getLastlinenote1() {
			return lastlinenote1;
		}
		
		public WebElement getCertifications() {
			return certifications;
		}

		public WebElement getSeleniumcourse() {
			return seleniumcourse;
		}

		public WebElement getPrintseleHead() {
			return printseleHead;
		}

		public WebElement getPrintselepara() {
			return printselepara;
		}


		//note3
		@FindBy(xpath="//a[text()='COURSES']")
		private WebElement courses;
		
		@FindBy(xpath="//span[text()='Java Training']")
		private WebElement javatrain;
		
		@FindBy(xpath="//span[text()='Core Java Training']")
		private WebElement javacoretrain;
		
		@FindBy(xpath="//h2[contains(text(),'Anitha')]")
		private WebElement printnote3;
		
		public WebElement getCourses() {
			return courses;
		}

		public WebElement getJavatrain() {
			return javatrain;
		}

		public WebElement getJavacoretrain() {
			return javacoretrain;
		}
		
		public WebElement getPrintnote3() {
			return printnote3;
		}
		//note4
		@CacheLookup
		@FindAll({
			@FindBy(xpath="(//a[text()='Careers'])[1]"),
			@FindBy(xpath="(//a[@href='careers.html'])[1]")
		})
		private WebElement careers;
		
		@CacheLookup
		@FindBy(xpath="//div[contains(text(),' © 2020')]")
		private WebElement scrolldownnote4;
		
		@CacheLookup
		@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
		private WebElement printnote4;
		
		public WebElement getCareers() {
			return careers;
		}

		public WebElement getScrolldownnote4() {
			return scrolldownnote4;
		}

		public WebElement getPrintnote4() {
			return printnote4;
		}
		
		//note5
		@CacheLookup
		@FindBy(xpath="//a[text()='TESTIMONIALS']")
		private WebElement testimonials;
		
		@FindBy(xpath="//div[contains(text(),'This entire credit goes to Greens')]")
		private WebElement lastlinenote5;
		
		public WebElement getTestimonials() {
			return testimonials;
		}

		public WebElement getLastlinenote5() {
			return lastlinenote5;
		}

		//note6
		@FindBy(xpath="//a[text()='CONTACT US']")
		private WebElement contactus;
		
		@CacheLookup
		@FindBys({
			@FindBy(xpath="//h3[@class='title divider-3']"),
			@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
		})
		private WebElement firstlinenote6;
		
		@CacheLookup
		@FindBys({
			@FindBy(xpath="//p[contains(text(),'Copyright')]"),
			@FindBy(xpath="//div[@class='col-md-6 col-sm-6 left-side']")
		})
		private WebElement lastlinenote6;
		
		public WebElement getLastlinenote6() {
			return lastlinenote6;
		}

		public WebElement getFirstlinenote6() {
			return firstlinenote6;
		}

		public WebElement getContactus() {
			return contactus;
		}

		
		


		
	}


