package TestSuites;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Pages.CaptureAlert;
import Pages.HospitalNames;
import Pages.TopCities;

public class SmokeTesting extends Base{
	
	HospitalNames hn = new HospitalNames();
	TopCities tc = new TopCities();
	CaptureAlert ca = new CaptureAlert();
	
	@BeforeTest
	public void invokeBrowser() {
		hn.invokeBrowser();
		hn.openURL("websiteURLKey");
	}
	
	@Test
	public void testing() throws InterruptedException {
		hn.getHospitalNames();
	}
	
	@AfterTest
	public void closeBrowser() {
		ca.closeBrowser();
	}
}
