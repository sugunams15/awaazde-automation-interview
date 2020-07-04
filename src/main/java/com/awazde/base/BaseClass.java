package com.awazde.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected WebDriver driver;
	protected WebElement element;
	public BaseClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	public void open() {
		driver.get("http://weathershopper.pythonanywhere.com/");
		driver.manage().window().maximize();
	}
	
	public void close() {
		driver.close();
	}
	public WebElement getElement(By by) {
		return driver.findElement(by); 
		
	}
	
	public boolean isElementPresent(By by) {
		element = driver.findElement(by);
		if(element.equals(null))
			return false;
		else
			return true;
	}
	
	public List<WebElement> getElements(By by) {
		return driver.findElements(by); 
		
	}

}
