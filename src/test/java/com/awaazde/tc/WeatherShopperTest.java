package com.awaazde.tc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.awazde.base.BaseClass;
import com.awazde.lib.HomeScreenMethods;
import com.awazde.locators.ChekoutScreenLocators;
import com.awazde.locators.HomePageLocators;
import com.awazde.locators.MoisterizerScreenLocators;
import com.awazde.locators.SunscreenScreenLocators;

public class WeatherShopperTest extends BaseClass {
	HomeScreenMethods homeScreenMethods;
	@BeforeClass
	public void init() {
		homeScreenMethods = new HomeScreenMethods();
	}
	
	@Test
	public void validateHomeScreen() {
		homeScreenMethods.open();
		
		Assert.assertTrue(homeScreenMethods.isElementPresent(HomePageLocators.HOME_SCREEN_HEADING.getValue()), 
				"CurrentTemperature heading is not there");
		
		driver.close();
	}
	
	@Test
	public void ShoppingTest() {
		
		HashMap<String, Integer> aloehm = new HashMap<String, Integer>();
		
		if(homeScreenMethods.getTemperature()<19) {
			homeScreenMethods.openShopMoisturizerScreen();
			ArrayList<Integer> al1 = null;
			ArrayList<Integer> al2 = null;
			java.util.List<WebElement> elements = driver.findElements(MoisterizerScreenLocators.ALL_PRICES.getValue());
			for(int i =0;i<elements.size();i++) {
				if(driver.findElement(By.xpath("//p[contains(text(),'"+elements.get(i).getText()+"')]/preceding-sibling::p")).getText().contains("Aloe"))
					al1.add(Integer.parseInt(elements.get(i).getText().split("")[2]));
				else
					al2.add(Integer.parseInt(elements.get(i).getText().split("")[2]));
				
			}
			Collections.sort(al1);
			Collections.sort(al2);
			driver.findElement(By.xpath("//p[contains(text(),'"+al1.get(0)+"')]/following-sibling::button")).click();;
			driver.findElement(By.xpath("//p[contains(text(),'"+al2.get(0)+"')]/following-sibling::button")).click();;
			
			
			
			
		}
		else if (homeScreenMethods.getTemperature()>34) {
			homeScreenMethods.openShopSunscreenScreen();
			ArrayList<Integer> al1 = null;
			ArrayList<Integer> al2 = null;
			java.util.List<WebElement> elements = driver.findElements(SunscreenScreenLocators.ALL_PRICES.getValue());
			for(int i =0;i<elements.size();i++) {
				if(driver.findElement(By.xpath("//p[contains(text(),'"+elements.get(i).getText()+"')]/preceding-sibling::p")).getText().contains("SPF-50)"))
					al1.add(Integer.parseInt(elements.get(i).getText().split("")[2]));
				else
					al2.add(Integer.parseInt(elements.get(i).getText().split("")[2]));
				
			}
			Collections.sort(al1);
			Collections.sort(al2);
			driver.findElement(By.xpath("//p[contains(text(),'"+al1.get(0)+"')]/following-sibling::button")).click();
			driver.findElement(By.xpath("//p[contains(text(),'"+al2.get(0)+"')]/following-sibling::button")).click();
		}
		
		homeScreenMethods.getElement(By.xpath("//button[text()='Cart - ']"));
		homeScreenMethods.getElement(ChekoutScreenLocators.PAY_WITH_CARD_BTN.getValue());
	}

}
