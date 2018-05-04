package com.perfecto.components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Buslistcomponent extends QAFWebComponent{
	
		public Buslistcomponent (String locator) {
		super (locator);
	}

	@FindBy(locator = "deptarturetime.click")
	public QAFWebElement deptarturetimeClick;
	
	@FindBy(locator = "arrivaltime.click")
	private QAFWebElement arrivaltimeClick;
	
	@FindBy(locator = "busprice.click")
	private QAFWebElement buspriceClick;
	
	@FindBy(locator = "bustravel.name")
	private QAFWebElement bustravelName;
	
	@FindBy(locator="compo.busresultpage")
	private QAFWebElement compoBusresultpage;

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
	
    public QAFWebElement getcompoBusresultpage() {
	    return compoBusresultpage;
}
}
