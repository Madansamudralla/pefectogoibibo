/**
 * 
 */
package com.perfecto.steps;

import java.util.HashMap;
import java.util.Map;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

/**
 * @author Madan.Samudralla
 */
public class Busbooking extends WebDriverBaseTestPage<WebDriverTestPage>{
	@FindBy(locator = "Bustext.click")
	private QAFWebElement busimageClick;

	
	@QAFTestStep(description = "i opened the application")
	public void iOpenedTheApplication() {
		new WebDriverTestBase().getDriver();
	}
	
	@QAFTestStep(description = "Closing the application to restart")
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

	public QAFWebElement getBusimageClick() {
		return busimageClick;
	}
	@QAFTestStep(description= "User clicking on bus button")
	public void bustbtnclick() {
		busimageClick.waitForVisible();
		busimageClick.click();	
		QAFTestBase.pause(4000);
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	

}
