package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testsetUp() {
        // Arrange
        String url = "http://localhost:8080";
        Request request = new Request(url);

        // Act and Assert
        setUp();
        assertEquals(url, connection.getUrl());
        assertEquals(request, request);
        assertNotNull(cookieManager.getCookie("session_id"));
        assertTrue(cookies == cookieManager.getCookies());
    }

}