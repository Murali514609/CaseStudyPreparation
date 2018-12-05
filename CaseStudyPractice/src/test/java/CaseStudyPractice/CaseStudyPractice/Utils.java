package CaseStudyPractice.CaseStudyPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
	
	public static void getURL(WebDriver myDriver, String url) {
		myDriver.get(url);
	}
	
	public static void performImplicitWait(WebDriver myDriver, int seconds) {
		myDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void maximizeBrowser(WebDriver myDriver) {
		myDriver.manage().window().maximize();
	}

	public static WebDriver openBrowser(WebDriver myDriver, String browserName) {
		if(browserName.equals("Chrome")) {
			myDriver = new ChromeDriver();
			return myDriver;
		} else if(browserName.equals("FireFox")) {
			myDriver = new FirefoxDriver();
			return myDriver;
		} else {
			myDriver = null;
			return myDriver;
		}
		
	}
	
}
