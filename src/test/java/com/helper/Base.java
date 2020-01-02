package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;

	public static void lunchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hariharesh\\eclipse-workspace\\Cucumber1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void enterurl(String url) {
		driver.get(url);
			}
	public static void type(WebElement e,String name) {
        e.sendKeys(name);
	}
	public static void btnclick(WebElement loc) {
		loc.click();
	}
	public static void dropdown(WebElement e, String str) {
        Select s = new Select(e);
        s.selectByVisibleText(str);
	}
	public static String getvaluebyattribute(WebElement e) {
        return e.getAttribute("value");
	}
}
