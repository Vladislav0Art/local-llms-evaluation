package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestUserAgent {

    private String url = "http://example.com";

    @Test
    public void testUserAgent() {
        HttpConnection connection = new HttpConnection();
        String userAgent = "My User Agent";
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.getUserAgent());
    }

}