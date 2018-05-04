package com.perfecto.pages;

import java.util.List;

import org.hamcrest.Matchers;

import com.perfecto.components.Buslistcomponent;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class Bussearchlist extends WebDriverBaseTestPage<WebDriverTestPage>{

	
	//int i=0;
	@FindBy (locator="compo.busresultpage")
	private List<Buslistcomponent>compoBusresultpage;
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Buslistcomponent>getcompoBusresultpage(){
		return compoBusresultpage;
		
	}
	
	public void Verifysearchresult() 
	{
		Validator.verifyThat(compoBusresultpage.size(), Matchers.greaterThan(0));
		for(Buslistcomponent comp : compoBusresultpage) {
			
			Reporter.log(comp.getDeptarturetimeClick().getText());
			Reporter.log(comp.getArrivaltimeClick().getText());
			Reporter.log(comp.getBuspriceClick().getText());
			Reporter.log(comp.getBustravelName().getText());
		}
	}
	
	

}
