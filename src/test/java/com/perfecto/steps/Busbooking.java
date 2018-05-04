/**
 * 
 *//*
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

*//**
 * @author Madan.Samudralla
 *//*
public class Busbooking extends WebDriverBaseTestPage<WebDriverTestPage>{
	@FindBy(locator = "Bustext.click")
	private QAFWebElement BustextClick;
	
	@FindBy(locator= "Gotit.click")
	private QAFWebElement GotitClick;
	

	@FindBy(locator="origincity.click")
	private QAFWebElement origincityClick;
	

	@FindBy(locator="origincity.send")
	private QAFWebElement origincitySend;
	
	@FindBy(locator="originselect.click")
	private QAFWebElement originselectClick;
	
	@FindBy(locator="destination.click")
	private QAFWebElement destinationClick;
	
	@FindBy(locator="destinationselecting.click")
	private QAFWebElement destinationselectingClick;
	
	@FindBy(locator="calendar.click")
	private QAFWebElement calendarClick;
	
	@FindBy(locator="calendardatepick.click")
	private QAFWebElement calendardatepickClick;
	
	@FindBy(locator="bussearchbtn.click")
	private QAFWebElement bussearchbtnClick;
	
	@FindBy(locator="buslistok.click")
	private QAFWebElement buslistokClick;
	
	@QAFTestStep(description = "User opened the application")
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

	public QAFWebElement getBustextClick() {
		return BustextClick;
	}
	@QAFTestStep(description= "User clicking on bus button")
	public void bustbtnclick() {
		BustextClick.waitForVisible();
		BustextClick.click();	
		QAFTestBase.pause(4000);
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	public QAFWebElement getGotitClick() {
		return GotitClick;
	}
	
	@QAFTestStep(description= "User clicking on GOT IT btn")
	public void GotitClick() {
		GotitClick.waitForVisible();
		GotitClick.click();
	
	}
	
	public QAFWebElement getorigincityClick() {
		return origincityClick;
	}
	@QAFTestStep(description="User click on origin city")
	public void origincityclicks() {
		origincityClick.click();
	}
	
	public QAFWebElement getorigincitySend() {
		return origincitySend;
	}
	@QAFTestStep(description="User enter origin city")
	public void origincitySend() {
		origincitySend.waitForVisible();
		origincitySend.click();
		origincitySend.sendKeys("Hyderabad");
		origincitySend.click();
	}
	
	public QAFWebElement getoriginselectClick() {
		return originselectClick;
	}
	
	@QAFTestStep(description="User slelecting the origin city")
	public void originselectclick() {
		originselectClick.waitForVisible();
		originselectClick.click();
	}
	public QAFWebElement getdestinationClick() {
		return destinationClick;
	}
	
	@QAFTestStep(description="User clicking on the destination btn")
	public void destinationcityclick() {
		destinationClick.waitForVisible();
		destinationClick.click();
		}
	@QAFTestStep(description="User entering destination city")
	public void destinationcityenter() {
		origincitySend.waitForVisible();
		origincitySend.click();
		origincitySend.sendKeys("Pune");
		destinationselectingClick.click();
	
		}
	
	public QAFWebElement getdestinationselectingClick() {
		return destinationselectingClick;
	}
	
	public QAFWebElement getcalendarClick() {
		return calendarClick;
	}
	
	@QAFTestStep(description="User clicks on calendar btn")
	public void calendarbtnclick() {
		calendarClick.click();
		calendardatepickClick.click();
	}
	
	public QAFWebElement getcalendardatepickClick() {
		return calendardatepickClick;
	}
	
	public QAFWebElement getbussearchbtnClick() {
		return bussearchbtnClick;
	}
	
	@QAFTestStep(description="User clicks buses search btn")
	public void bussearchbtn() {
		bussearchbtnClick.waitForVisible();
		bussearchbtnClick.click();
		QAFTestBase.pause(5000);
	}
	
	public QAFWebElement getbuslistokClick() {
		return buslistokClick;
	}
	
	@QAFTestStep(description="User clicks on buses list ok btn")
	public void buslistokbtn() {
		buslistokClick.click();
	}
}
*/