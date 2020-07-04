package com.awazde.locators;

import org.openqa.selenium.By;

public enum HomePageLocators {
	TEMPERATURE("id#temperature"),
	BUY_MOISTURIZERS_BTN("xpath#////button[text()='Buy moisturizers']"),
	BUY_SUNSCREENS_BTN("xpath#//button[text()='Buy sunscreens']"),
	MOISTURIZER_DESC("xpath#//h3[text()='Moisturizers']/parent::div/p"),
	SUNSCREEN_DESC("xpath#//h3[text()='Moisturizers']/parent::div/p"),
	;
	
	private String value;
	
	private HomePageLocators(String value) {
		this.value = value;
		
	}
	
	public By getValue() {
		if(value.split("#")[0].equals("xpath")) {
			return By.xpath(value.split("#")[1]);
		}
		
		else if(value.split("#")[0].equals("id")) {
			return By.id(value.split("#")[1]);
		}
		else {
			return By.cssSelector(value.split("#")[1]);
		}
	}


}
