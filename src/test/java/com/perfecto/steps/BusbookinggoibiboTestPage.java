package com.perfecto.steps;

import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class BusbookinggoibiboTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "Busimage.click")
	private QAFWebElement busimageClick;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getBusimageClick() {
		return busimageClick;
	}
	
	public void bustbtnclick() {
		busimageClick.waitForVisible();
		busimageClick.click();	
		QAFTestBase.pause(4000);
	}
	
	
}
