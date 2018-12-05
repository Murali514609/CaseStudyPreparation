package CaseStudy.API.test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.BeforeTest;


public class CaseStudyAPITest {
	private String GIT_URL = "https://api.github.com/"; 
	private Response myresponce;

	@BeforeTest
	public void beforeSetUp() {
		myresponce = RestAssured.get(GIT_URL+"users/murali514609/repos");
	}

	@Test
	public void validateAPIUrlResponse() {
		int responseCode = response.getStatusCode();
		assertTrue(responseCode == 200);
	}

	@Test
	public void printResponse() {
		response.prettyPrint();
	}

	@Test
	public void verifyRepositoryCount() {
		List<Integer> repositoryCount = response.getBody().jsonPath().getList("$");
		System.out.println(repositoryCount.size());
		assertTrue(repositoryCount.size() == 6);

	}

	@Test
	public void captureResponseHeadersAndPrint() {
		Headers headersCaptured = response.getHeaders();
		Iterator<Header> headerIterator = headersCaptured.iterator();
		while (headerIterator.hasNext()) {
			Header header = (Header) headerIterator.next();
			System.out.println("Key: "+header.getName()+", Value: "+header.getValue());
		}
	}

	@Test
	public void assertListOfRepositoriesIds() {
		response.then().body("id", Matchers.hasItems(41202414, 152239814, 151860805, 117455365, 106032543, 117455272));
	}

	@Test
	public void assertDataAtSpecificPath() {
		String nodeId = response.getBody().jsonPath().get("owner.node_id[0]");
		assertTrue(nodeId.equals("MDQ6VXNlcjIxODc1NzA="));
	}

	@Test
	public void getMapData() {
		Map<String, String> ownerMap = response.body().jsonPath().getMap("owner[0]");
		assertTrue(ownerMap.containsValue("binnujesudasan"));
	}

}
