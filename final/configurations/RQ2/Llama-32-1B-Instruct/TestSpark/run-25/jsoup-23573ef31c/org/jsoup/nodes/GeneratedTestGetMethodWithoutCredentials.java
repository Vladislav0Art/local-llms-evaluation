package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetMethodWithoutCredentials {

    @BeforeEach
    void setUp() {
        // Create mock objects
        MockRequest request = new MockRequest();
        MockResponse response = new MockResponse();

        // Initialize test variables
        RequestHandler handler = new RequestHandler(request, response);
    }

    @Test
    public void testGetMethodWithoutCredentials() {
        MockRequest request = new MockRequest("GET", "/users");
        MockResponse response = new MockResponse();
        RequestHandler handler = new RequestHandler(request, response);

        // Call the method
        int statusCode = handler.getMethod().call();

        // Check status code
        assertEquals(200, statusCode);
    }

}