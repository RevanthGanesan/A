package com.Pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class FifthPage extends Base{
	public FifthPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="order_no")
	private List<WebElement> orid;
	public List<WebElement> getOrid() {
		return orid;
	}
}
