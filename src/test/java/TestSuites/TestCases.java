package TestSuites;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Pages.CaptureAlert;
import Pages.HospitalNames;
import Pages.TopCities;

public class TestCases extends Base {

	HospitalNames hn = new HospitalNames();
	TopCities tc = new TopCities();
	CaptureAlert ca = new CaptureAlert();

	@BeforeTest
	public void invokeBrowser() {
		logger = report.createTest("Executing Test Cases");

		hn.invokeBrowser();
		reportPass("Browser is Invoked");
	}

	@Test(priority = 1)
	public void hospitalNames() throws InterruptedException {

		hn.openURL("websiteURLKey");
		reportPass("URL is Opened");
		hn.getHospitalNames();
		reportPass("Hospitals are Retrieved");
	}

	@Test(priority = 2)
	public void TopCities() {
		hn.openURL("websiteURLKey");
		reportPass("Navigated Back to the Home Page");
		tc.getCities();
		reportPass("Top Cities are retrieved");
	}

	@Test(priority = 3)
	public void CaptureAlert() throws InterruptedException, IOException {
		tc.openURL("websiteURLKey");
		reportPass("Navigated Back to the Home Page");
		ca.formFill();
		reportPass("Alerts are Obtained");
	}

	@AfterTest
	public void closeBrowser() {
		ca.endReport();
		ca.closeBrowser();
	}

}
