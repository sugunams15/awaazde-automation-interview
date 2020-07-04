package com.awazde.lib;


import org.openqa.selenium.WebDriver;

import com.awazde.base.BaseClass;
import com.awazde.locators.HomePageLocators;

public class HomeScreenMethods extends BaseClass {
	WebDriver driver;
	public HomeScreenMethods() {
		driver = super.driver;
	}

	public int getTemperature() {
		int temperture;
		temperture = Integer.parseInt(getElement(HomePageLocators.TEMPERATURE.getValue()).getText());
		return temperture;
	}
	
	public void openShopMoisturizerScreen() {
		getElement(HomePageLocators.BUY_MOISTURIZERS_BTN.getValue()).click();
	}
	
	public void openShopSunscreenScreen() {
		getElement(HomePageLocators.BUY_SUNSCREENS_BTN.getValue()).click();
	}
}
