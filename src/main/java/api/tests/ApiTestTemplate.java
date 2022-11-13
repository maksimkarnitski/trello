package api.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import common.PropertyReader;

import static io.restassured.RestAssured.given;

public class ApiTestTemplate {
    public static RequestSpecification specGetRequest;
    @BeforeClass
    public void config() {
        PropertyReader propertyReader = new PropertyReader();
        String url = propertyReader.getBaseApiUrlProperty();
        String token = propertyReader.getToken();
        String apiKey = propertyReader.getApiKey();

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        specGetRequest = given()
                .baseUri(url)
                .queryParam("token", token)
                .queryParam("key", apiKey)
                .accept(ContentType.JSON);
    }
}
