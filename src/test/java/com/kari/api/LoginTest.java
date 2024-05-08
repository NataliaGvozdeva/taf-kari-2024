package com.kari.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {

    @Test
    @DisplayName("Check 200 Unauthorized status code")
    public void testLogin1() {
        given().body(LoginService.BODY_1).contentType("application/json").
                when().
                post("https://by.kari.com/by/cabinet/?login=yes").
                then().log().all().
                statusCode(200);
    }
}
