package com.Pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class SecondPage extends Base{
	public SecondPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="location")
	private List<WebElement> location;
	@FindBy(id="hotels")
	private List<WebElement> hotels;
	public List<WebElement> getLocation() {
		return location;
	}
	public List<WebElement> getHotels() {
		return hotels;
	}
	public List<WebElement> getRoom_type() {
		return room_type;
	}
	public List<WebElement> getRoom_nos() {
		return room_nos;
	}
	public List<WebElement> getDatepick_in() {
		return datepick_in;
	}
	public List<WebElement> getDatepick_out() {
		return datepick_out;
	}
	public List<WebElement> getAdult_room() {
		return adult_room;
	}
	public List<WebElement> getChild_room() {
		return child_room;
	}
	public List<WebElement> getSubmit() {
		return Submit;
	}
	@FindBy(id="room_type")
	private List<WebElement> room_type;
	@FindBy(id="room_nos")
	private List<WebElement> room_nos;
	@FindBy(id="datepick_in")
	private List<WebElement> datepick_in;
	@FindBy(id="datepick_out")
	private List<WebElement> datepick_out;
	@FindBy(id="adult_room")
	private List<WebElement> adult_room;
	@FindBy(id="child_room")
	private List<WebElement> child_room;
	@FindBy(id="Submit")
	private List<WebElement> Submit;
	

}
