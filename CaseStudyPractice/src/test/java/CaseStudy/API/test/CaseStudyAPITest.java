package CaseStudy.API.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class CaseStudyAPITest {
	private String GIT_URL = "https://api.github.com/"; 
	private Response myresponce;

	@BeforeTest
	public void beforeSetUp() {
		myresponce = RestAssured.get(GIT_URL+"users/murali514609/repos");
	}

	@Test
	public void validateAPIUrlResponse() {
		int responseCode = myresponce.getStatusCode();
		if(responseCode == 200) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

	@Test
	public void validateOwnerNodeID() {
		String nodeId = myresponce.getBody().jsonPath().get("owner.node_id[0]");
		if(nodeId.equals("MDQ6VXNlcjQ1NTkzNjg0")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		
	}
	
	@Test
	public void validateOwnerName() {
		String nodeId = myresponce.getBody().jsonPath().get("owner.login[0]");
		if(nodeId.equals("Murali514609")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		
	}

	@Test
	public void validateName() {
		String nodeId = myresponce.getBody().jsonPath().get("name");
		if(nodeId.equals("CaseStudyPreparation")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		
	}
	
	@Test
	public void validateUserId() {
		String nodeId = myresponce.getBody().jsonPath().get("id");
		if(nodeId.equals("160344627")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		
	}

}
