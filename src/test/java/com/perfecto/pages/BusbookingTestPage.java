package com.perfecto.pages;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class BusbookingTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "origincity.click")
	private QAFWebElement origincityClick;
	@FindBy(locator = "origincity.send")
	private QAFWebElement origincitySend;
	@FindBy(locator = "originselect.click")
	private QAFWebElement originselectClick;
	@FindBy(locator = "destination.click")
	private QAFWebElement destinationClick;
	@FindBy(locator = "destinationcity.send")
	private QAFWebElement destinationcitySend;
	@FindBy(locator = "destinationselecting.click")
	private QAFWebElement destinationselectingClick;
	@FindBy(locator = "calendar.click")
	private QAFWebElement calendarClick;
	@FindBy(locator = "calendardatepick.click")
	private QAFWebElement calendardatepickClick;
	@FindBy(locator = "bussearchbtn.click")
	private QAFWebElement bussearchbtnClick;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getOrigincityClick() {
		return origincityClick;
	}

	public QAFWebElement getOrigincitySend() {
		return origincitySend;
	}

	public QAFWebElement getOriginselectClick() {
		return originselectClick;
	}

	public QAFWebElement getDestinationClick() {
		return destinationClick;
	}

	public QAFWebElement getDestinationcitySend() {
		return destinationcitySend;
	}

	public QAFWebElement getDestinationselectingClick() {
		return destinationselectingClick;
	}

	public QAFWebElement getCalendarClick() {
		return calendarClick;
	}

	public QAFWebElement getCalendardatepickClick() {
		return calendardatepickClick;
	}

	public QAFWebElement getBussearchbtnClick() {
		return bussearchbtnClick;
	}

	public void origincityclicks() {
		origincityClick.waitForVisible();
		origincityClick.click();
	}
	
	public void origincitySend() {
		origincitySend.waitForVisible();
		origincitySend.click();
		origincitySend.sendKeys("Hyderabad");
		
	}
	
	public void originselectclick() {
		originselectClick.waitForVisible();
		originselectClick.click();
	}
	
	public void destinationcityclick() {
		destinationClick.waitForVisible();
		destinationClick.click();
		}
	
	public void destinationcityenter() {
		origincitySend.waitForVisible();
		origincitySend.click();
		origincitySend.sendKeys("Pune");
		}
	
	public void destinationselection() {
		destinationselectingClick.waitForPresent();
		destinationselectingClick.click();
		}
	
	public void calendarbtnclick() {
		calendarClick.click();
		}
	
	public void calendarpickdate() {
		calendardatepickClick.waitForPresent();
		calendardatepickClick.click();
	}
	
	public void bussearchbtn() {
		try{
		bussearchbtnClick.waitForVisible();
		bussearchbtnClick.click();
		QAFTestBase.pause(5000);
	}
		catch(Exception e){
			
		}
		
	}
}
