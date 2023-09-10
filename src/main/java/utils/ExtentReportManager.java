package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;



public class ExtentReportManager {
	public static ExtentReports report;
public static ExtentReports getReportInstance(){
		
		if(report== null){
			ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Report/Report.html");
			report=new ExtentReports();
			report.attachReporter(htmlReporter);
			
			
//			report.setSystemInfo("OS", "Windows 11");
//			report.setSystemInfo("Environment", "UAT");
//			report.setSystemInfo("Build Number", "10.8.1");
//			report.setSystemInfo("Browser", "Chrome/Firefox");
			
			htmlReporter.config().setDocumentTitle("UI Automation Results");
			htmlReporter.config().setReportName("Group 1-Finding Hospitals Test Report");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		}
		
		return report;
	}

}
