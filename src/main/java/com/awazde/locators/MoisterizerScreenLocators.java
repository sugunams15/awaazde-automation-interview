package com.awazde.locators;

import java.util.ArrayList;

import org.openqa.selenium.By;

public enum MoisterizerScreenLocators {
	ALL_PRICES("xpath#//p[contains(text(),'Price')]"),
	ALOE_HYDRATION_LOTION("xpath#//p[text()='Wilhelm Aloe Hydration Lotion']"),
	Almond_and_Talc("xpath#//p[text()='Mikhail Almond and Talc']"),
	Almond_and_MoiSTURIZER("xpath#//p[text()='Alexander Almond & Honey Moisturiser']"),
	ALOE_ATTACK("xpath#//p[text()='Vassily Aloe Attack']"),
	ALOE_ISOLANI("xpath#//p[text()='Tigran Aloe Isolani']"),
	ALOE_BODY_LOTION("xpath#//p[text()='Jose Intensive Care Aloe Body Lotion']"),
	ALOE_HYDRATION_LOTION_ADD("xpath#//p[text()='Wilhelm Aloe Hydration Lotion']/following-sibling::button"),
	Almond_and_Talc_ADD("xpath#//p[text()='Mikhail Almond and Talc']/following-sibling::button"),
	Almond_and_MoiSTURIZER_ADD("xpath#//p[text()='Alexander Almond & Honey Moisturiser']/following-sibling::button"),
	ALOE_ATTACK_ADD("xpath#//p[text()='Vassily Aloe Attack']/following-sibling::button"),
	ALOE_ISOLANI_ADD("xpath#//p[text()='Tigran Aloe Isolani']/following-sibling::button"),
	ALOE_BODY_LOTION_ADD("xpath#//p[text()='Jose Intensive Care Aloe Body Lotion']/following-sibling::button"),
	
	
	;
	
	
	
	private String value;
	
	private MoisterizerScreenLocators(String value) {
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
