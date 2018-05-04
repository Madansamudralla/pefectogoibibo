package com.perfecto.Listeners;


import org.openqa.selenium.Capabilities;

import com.qmetry.qaf.automation.step.StepExecutionTracker;
import com.qmetry.qaf.automation.ui.webdriver.CommandTracker;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandListener;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElementCommandListener;

public class IOS  implements com.qmetry.qaf.automation.step.QAFTestStepListener,QAFWebDriverCommandListener,QAFWebElementCommandListener{

	@Override
	public void onFailure(StepExecutionTracker stepExecutionTracker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforExecute(StepExecutionTracker stepExecutionTracker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterExecute(StepExecutionTracker stepExecutionTracker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeCommand(QAFExtendedWebDriver driver,
			CommandTracker commandHandler) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCommand(QAFExtendedWebDriver driver, CommandTracker commandHandler) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFailure(QAFExtendedWebDriver driver, CommandTracker commandHandler) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeInitialize(Capabilities desiredCapabilities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInitialize(QAFExtendedWebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInitializationFailure(Capabilities desiredCapabilities, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeCommand(QAFExtendedWebElement element,
			CommandTracker commandTracker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCommand(QAFExtendedWebElement element,
			CommandTracker commandTracker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFailure(QAFExtendedWebElement element, CommandTracker commandTracker) {
		// TODO Auto-generated method stub
		
	}

}
