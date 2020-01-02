package com.stepdefiniton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.helper.Base;
import com.manager.PomManager;

import cucumber.api.java.en.*;

public class StepDefinition extends Base {
	PomManager pm = new PomManager();

	@Given("user is on adaction home page")
	public void user_is_on_adaction_home_page() {
		lunchbrowser();
		enterurl("http://adactin.com/HotelApp/index.php"); 
	}

	@When("user enter the {string}, {string} and click the login button")
	public void user_enter_the_and_click_the_login_button(String string, String string2) {
	    WebElement u = pm.getFirstpage().getUser().get(0);
	    type(u, string);
	    WebElement p = pm.getFirstpage().getPass().get(0);
	    type(p, string2);
	    btnclick(pm.getFirstpage().getLogin().get(0));  
	}

	@When("user is on home page select{string},{string},{string},{string},{string},{string},{string},{string} hit the search button")
	public void user_is_on_home_page_select_hit_the_search_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  dropdown(pm.getSecondpage().getLocation().get(0), string);
	  dropdown(pm.getSecondpage().getHotels().get(0), string2);
	  dropdown(pm.getSecondpage().getRoom_type().get(0), string3);
	  dropdown(pm.getSecondpage().getRoom_nos().get(0), string4);
	  type(pm.getSecondpage().getDatepick_in().get(0), string5);
	  type(pm.getSecondpage().getDatepick_out().get(0), string6);
	  dropdown(pm.getSecondpage().getAdult_room().get(0), string7);
	  dropdown(pm.getSecondpage().getChild_room().get(0), string8);
	  btnclick(pm.getSecondpage().getSubmit().get(0));
	}

	@When("select the hotel and click the continue button")
	public void select_the_hotel_and_click_the_continue_button() {
	   btnclick(pm.getThirdPage().getRadiobutton_0().get(0)); 
	   btnclick(pm.getThirdPage().getCont().get(0));
	}

	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string} click the book now button")
	public void user_enter_the_click_the_book_now_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  type(pm.getFourthPage().getFirst_name().get(0), string);  
	  type(pm.getFourthPage().getLast_name().get(0), string2);
	  type(pm.getFourthPage().getAddress().get(0), string3);
	  type(pm.getFourthPage().getCc_num().get(0), string4);
	  dropdown(pm.getFourthPage().getCc_type().get(0), string5);
	  dropdown(pm.getFourthPage().getCc_exp_month().get(0), string6);
	  dropdown(pm.getFourthPage().getCc_exp_year().get(0), string7);
	  type(pm.getFourthPage().getCc_cvv().get(0), string8);
	  btnclick(pm.getFourthPage().getBook_now().get(0));
	}

	@Then("verify the url.")
	public void verify_the_url() {
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	/*   WebElement t = pm.getFifthPage().getOrid().get(0);
	   String x1 = t.getAttribute("value");
	  System.out.println(x1);*/
		System.out.println(pm.getFifthPage().getOrid().get(0).getAttribute("value"));
	   
	}



	
}
