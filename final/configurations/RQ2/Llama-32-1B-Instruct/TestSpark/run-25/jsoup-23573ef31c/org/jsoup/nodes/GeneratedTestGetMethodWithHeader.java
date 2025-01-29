package org.jsoup.nodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetMethodWithHeader {

    @BeforeEach
    void setUp() {
        // Create mock objects
        MockRequest request = new MockRequest();
        MockResponse response = new MockResponse();

        // Initialize test variables
        RequestHandler handler = new RequestHandler(request, response);
    }

    @Test
    public void testGetMethodWithHeader() {
        MockRequest request = new MockRequest("GET", "/users?username=john");
        MockResponse response = new MockResponse();
        RequestHandler handler = new RequestHandler(request, response);

        // Call the method
        int statusCode = handler.getMethod().call();

        // Check status code
        assertEquals(200, statusCode);
    }

}