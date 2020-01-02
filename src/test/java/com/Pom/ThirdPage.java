package com.Pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class ThirdPage extends Base{
	public ThirdPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="radiobutton_0")
	private List<WebElement> radiobutton_0;
	@FindBy(id="continue")
	private List<WebElement> cont;
	public List<WebElement> getRadiobutton_0() {
		return radiobutton_0;
	}
	public List<WebElement> getCont() {
		return cont;
	}
	
}
