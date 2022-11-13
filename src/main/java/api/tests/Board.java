package api.tests;

import api.objectModels.BoardGet;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Board extends ApiTestTemplate{
    String boardPath = "/1/boards/{id}";
    String idForGet = "F7UrFeYy";
    @Test
    void getBoard() {
        BoardGet bodyResponse =
                given()
                    .spec(specGetRequest)
                .when()
                    .get(boardPath, idForGet)
                .then()
                    .statusCode(200)
                .extract().response().as(BoardGet.class);
        Assert.assertEquals(bodyResponse.getName(), "abc");
        Assert.assertEquals(bodyResponse.getPrefs().getPermissionLevel(), "org");
    }
}
