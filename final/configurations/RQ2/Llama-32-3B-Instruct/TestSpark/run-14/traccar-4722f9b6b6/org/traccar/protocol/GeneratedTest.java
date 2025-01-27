package org.traccar.protocol;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class GeneratedTest {

    public String getWatchMessage() {
        return "Hello, World!";
    }
}

public class SparkTest {

    @Test
    public void testWatchProtocol() {
        RestAssured.baseURI = "http://api.example.com";
        RestAssured.requestSpecification.queryParam("id", 123);

        switch (Method.valueOf("WATCH")) {
            case WATCH -> {
                String response = RestAssured.given()
                        .method(Method.WATCH)
                        .queryParam("id", 123)
                        .get("/watch")
                        .body()
                        .asString();

                assert response.contains("message");
            }
        }
    }

}