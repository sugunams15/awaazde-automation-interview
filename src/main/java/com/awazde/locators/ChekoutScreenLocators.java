package com.awazde.locators;

import org.openqa.selenium.By;

public enum ChekoutScreenLocators {
	ITEM_NAME("xpath#//tbody//td[1]"),
	ITEM_PRICE("xpath#//td[2]"),
	TOTAL_PRICE("id#total"),
	PAY_WITH_CARD_BTN("xpath#//button/span[text()='Pay with Card']"),
	
	;
	
	private String value;
	
	private ChekoutScreenLocators(String value) {
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
