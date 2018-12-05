package CaseStudyPractice.CaseStudyPractice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.LogStatus;




public class LoginPageLinkelin {
	WebDriver driver;
	String expectedTitle = "World’s Largest Professional Network | LinkedIn";


	@BeforeMethod
	public void setUp() {
		driver = Utils.openBrowser(driver, "FireFox");
		Utils.maximizeBrowser(driver); 
		Utils.performImplicitWait(driver, 5);
		Utils.getURL(driver,"https://www.linkedin.com/");
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("LoginPageLinkelin");
	}
	

	
	@Test(dataProvider="testData")
	public void testLogin(String username, String password, String errorMessage) {
		String actualTitle = driver.getTitle();

		if(actualTitle.equals(expectedTitle)) {
			test.log(LogStatus.PASS, "Navigated to the specified URL as expected");
		}else {
			test.log(LogStatus.FAIL, "Not navigated to the specified URL");
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}