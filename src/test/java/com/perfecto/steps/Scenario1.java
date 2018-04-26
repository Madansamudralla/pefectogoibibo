package com.perfecto.steps;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
	public class Scenario1 {
	
	@Test
	@QAFTestStep(description="user navigates to home page")
	public void openApp() {
		CommonStep.waitForPresent("txt.mobileNum.signInPage");
	}
	
	public void login(String mobile,String password) {
		CommonStep.waitForPresent("txt.mobileNum.signInPage");
		CommonStep.sendKeys(mobile, "txt.mobileNum.signInPage");
		CommonStep.click("btn.continue.signInPage");
		CommonStep.waitForPresent("txt.password.SignInPage");
		CommonStep.sendKeys(password, "txt.password.SignInPage");
		CommonStep.click("btn.signIn.signInPage");	
	}
}
