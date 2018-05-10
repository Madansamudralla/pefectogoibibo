package com.perfecto.Listeners;


import org.openqa.selenium.Capabilities;

import com.qmetry.qaf.automation.step.StepExecutionTracker;
import com.qmetry.qaf.automation.ui.webdriver.CommandTracker;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandListener;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElementCommandListener;
import com.qmetry.qaf.automation.util.Reporter;

public class android  implements com.qmetry.qaf.automation.step.QAFTestStepListener,QAFWebDriverCommandListener,QAFWebElementCommandListener{

	@Override
	public void onFailure(StepExecutionTracker stepExecutionTracker) {
		Reporter.logWithScreenShot("Test step id failed");
		
	}

	@Override
	public void beforExecute(StepExecutionTracker stepExecutionTracker) {
		Reporter.log("Test step will execute ");
		
	}

	@Override
	public void afterExecute(StepExecutionTracker stepExecutionTracker) {
		Reporter.log("Test step execution is completed");		
	}

	@Override
	public void beforeCommand(QAFExtendedWebDriver driver,
			CommandTracker commandHandler) {
		Reporter.log("Command will execute");		
	}

	@Override
	public void afterCommand(QAFExtendedWebDriver driver, CommandTracker commandHandler) {
		Reporter.log("Command is executed ");		
	}

	@Override
	public void onFailure(QAFExtendedWebDriver driver, CommandTracker commandHandler) {
		Reporter.log("Command execution is failed ");		
	}

	@Override
	public void beforeInitialize(Capabilities desiredCapabilities) {
		Reporter.log("Driver will intialize");		
	}

	@Override
	public void onInitialize(QAFExtendedWebDriver driver) {
		Reporter.log("Driver intialization is done ");		
	}

	@Override
	public void onInitializationFailure(Capabilities desiredCapabilities, Throwable t) {
		Reporter.log("Driver intialization is failed ");		
	}

	@Override
	public void beforeCommand(QAFExtendedWebElement element,
			CommandTracker commandTracker) {
		Reporter.log("WebElement listener before command");		
	}

	@Override
	public void afterCommand(QAFExtendedWebElement element,
			CommandTracker commandTracker) {
		Reporter.log("WebElement listener after command");		
	}

	@Override
	public void onFailure(QAFExtendedWebElement element, CommandTracker commandTracker) {
		Reporter.log("WebElement listener on command failure ");		
	}

}



