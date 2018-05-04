package com.perfecto.steps;

import com.perfecto.pages.BusbookingTestPage;
import com.perfecto.pages.Bussearchlist;
import com.perfecto.pages.HomeTestPage;
import com.perfecto.pages.Launchapplication;
import com.qmetry.qaf.automation.step.QAFTestStep;

public class Busbookingsteps {
	Launchapplication launchapp = new Launchapplication();
	HomeTestPage homepage = new HomeTestPage();
	BusbookingTestPage busbooking = new BusbookingTestPage();
	Bussearchlist buslist = new Bussearchlist();
	

@QAFTestStep(description = "User launch the application" )
public void launchgoibiboapp() {
  launchapp.launchapplication();
  launchapp.restarttheapp();
}

@QAFTestStep(description= "User selected BUS to book ticket")
public void busselection() {
homepage.bustbtnclick();
}

@QAFTestStep(description="User started booking process")
public void busticketbooking() {
	busbooking.origincityclicks();
	busbooking.origincitySend();
	busbooking.originselectclick();
	busbooking.destinationcityclick();
	busbooking.destinationcityenter();
	busbooking.destinationselection();
	busbooking.calendarbtnclick();
	busbooking.calendarpickdate();
	busbooking.bussearchbtn();
}

@QAFTestStep(description= "User verifying the bus list")
public void buslist() {
	buslist.Verifysearchresult();
}
}
