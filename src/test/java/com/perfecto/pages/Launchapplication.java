package com.perfecto.pages;

import java.util.HashMap;
import java.util.Map;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class Launchapplication {
	
	public void launchapplication() {
		new WebDriverTestBase().getDriver();
	}
	
	
	public void restarttheapp() {
		Map<String, Object> params1 = new HashMap<>();
		params1.put("name", "Goibibo");
		Object result1 = new WebDriverTestBase().getDriver().executeScript("mobile:application:close", params1);
		System.out.println("end close app");
		Map<String, Object> params2 = new HashMap<>();
		params2.put("name", "Goibibo");
		Object result2 = new WebDriverTestBase().getDriver().executeScript("mobile:application:open", params2);
		System.out.println("end close app");
		//CommonStep.click("Bustext.click");
	}

}
