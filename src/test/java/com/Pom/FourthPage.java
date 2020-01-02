package com.Pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class FourthPage extends Base{
	public FourthPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="first_name")
	private List<WebElement> first_name;
	@FindBy(id="last_name")
	private List<WebElement> last_name;
	@FindBy(id="address")
	private List<WebElement> address;
	@FindBy(id="cc_num")
	private List<WebElement> cc_num;
	@FindBy(id="cc_type")
	private List<WebElement> cc_type;
	@FindBy(id="cc_exp_month")
	private List<WebElement> cc_exp_month;
	@FindBy(id="cc_exp_year")
	private List<WebElement> cc_exp_year;
	@FindBy(id="cc_cvv")
	private List<WebElement> cc_cvv;
	@FindBy(id="book_now")
	private List<WebElement> book_now;
	public List<WebElement> getFirst_name() {
		return first_name;
	}
	public List<WebElement> getLast_name() {
		return last_name;
	}
	public List<WebElement> getAddress() {
		return address;
	}
	public List<WebElement> getCc_num() {
		return cc_num;
	}
	public List<WebElement> getCc_type() {
		return cc_type;
	}
	public List<WebElement> getCc_exp_month() {
		return cc_exp_month;
	}
	public List<WebElement> getCc_exp_year() {
		return cc_exp_year;
	}
	public List<WebElement> getCc_cvv() {
		return cc_cvv;
	}
	public List<WebElement> getBook_now() {
		return book_now;
	}	

}
