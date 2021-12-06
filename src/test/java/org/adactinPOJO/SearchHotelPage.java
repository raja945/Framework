package org.adactinPOJO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class SearchHotelPage extends BaseClass{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomnos;
	@FindAll({
		@FindBy(name="datepick_in"),
		@FindBy(xpath="//input[@class='date_pick']")
	})
	private WebElement chkin;
	
	@FindAll({
		@FindBy(xpath="//input[@class='date_pick']"),
		@FindBy (name="datepick_out")
	})
	private WebElement chkout;
	
	@FindBy (id="adult_room")
	private WebElement adultrm;
	@FindBy (id="child_room")
	private WebElement childrm;
	@FindBy (id="Submit")
	private WebElement submitBtn;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnos() {
		return roomnos;
	}
	public WebElement getChkin() {
		return chkin;
	}
	public WebElement getChkout() {
		return chkout;
	}
	public WebElement getAdultrm() {
		return adultrm;
	}
	public WebElement getChildrm() {
		return childrm;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
}
