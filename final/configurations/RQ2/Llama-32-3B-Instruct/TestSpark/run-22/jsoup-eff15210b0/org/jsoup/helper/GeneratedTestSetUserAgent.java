package org.jsoup.helper;

public class GeneratedTestSetUserAgent {

    @Test
    public void testSetUserAgent() {
        String userAgent = "My User Agent";
        HttpConnection.userAgent(userAgent);
        assertEquals(userAgent, HttpConnection.getUserAgent());
    }

}