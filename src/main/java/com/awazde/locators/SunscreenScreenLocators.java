package com.awazde.locators;

import java.util.ArrayList;

import org.openqa.selenium.By;

public enum SunscreenScreenLocators {
	ALL_PRICES("xpath#//p[contains(text(),'Price')]"),
	AKIBA_AMAZING("xpath#//p[text()='Akiba Amazing SPF-50']"),
	BIO_SANDLEWOOD("xpath#//p[text()='Gary Bio Sandalwood SPF-50']"),
	MAGNUS_RESISTANT("xpath#//p[text()='Magnus Resistant Sunscreen SPF-30']"),
	PAUL_MAGNIFICIENT("xpath#//p[text()='Paul Magnificient SPF-30']"),
	ROBERT_HERBALS("xpath#//p[text()='Robert Herbals Sunblock SPF-40']"),
	ANATOLY_ULTRA("xpath#//p[text()='Anatoly Ultra Sunblock SPF-50']"),
	AKIBA_AMAZING_ADD("xpath#//p[text()='Akiba Amazing SPF-50']/following-sibling::button"),
	BIO_SANDLEWOOD_ADD("xpath#//p[text()='Gary Bio Sandalwood SPF-50']/following-sibling::button"),
	MAGNUS_RESISTANT_ADD("xpath#//p[text()='Magnus Resistant Sunscreen SPF-30']/following-sibling::button"),
	PAUL_MAGNIFICIENT_ADD("xpath#//p[text()='Paul Magnificient SPF-30']/following-sibling::button"),
	ROBERT_HERBALS_ADD("xpath#//p[text()='Robert Herbals Sunblock SPF-40']/following-sibling::button"),
	ANATOLY_ULTRA_ADD("xpath#//p[text()='Jose Intensive Care Aloe Body Lotion']/following-sibling::button"),
	;
	
	
	
	private String value;
	
	private SunscreenScreenLocators(String value) {
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
