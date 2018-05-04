package com.perfecto.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class BussearchlistTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "deptarturetime.click")
	private QAFWebElement deptarturetimeClick;
	
	@FindBy(locator = "arrivaltime.click")
	private QAFWebElement arrivaltimeClick;
	
	@FindBy(locator = "busprice.click")
	private QAFWebElement buspriceClick;
	
	@FindBy(locator = "bustravel.name")
	private QAFWebElement bustravelName;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getDeptarturetimeClick() {
		return deptarturetimeClick;
	}

	public QAFWebElement getArrivaltimeClick() {
		return arrivaltimeClick;
	}

	public QAFWebElement getBuspriceClick() {
		return buspriceClick;
	}

	public QAFWebElement getBustravelName() {
		return bustravelName;
	}
	
	

}
