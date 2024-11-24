package br.edu.fatecsjc.lgnspringapi.resource;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class AuthenticationResourceTest {

    @Test
    void testRegisterAndAuthenticate() {
        given()
            .contentType("application/json")
            .body("{\"email\":\"test@example.com\", \"password\":\"password123\"}")
        .when()
            .post("http://localhost:8000/auth/register")
        .then()
            .statusCode(200);

        given()
            .contentType("application/json")
            .body("{\"email\":\"test@example.com\", \"password\":\"password123\"}")
        .when()
            .post("http://localhost:8000/auth/authenticate")
        .then()
            .statusCode(200)
            .body("token", notNullValue());
    }
}
