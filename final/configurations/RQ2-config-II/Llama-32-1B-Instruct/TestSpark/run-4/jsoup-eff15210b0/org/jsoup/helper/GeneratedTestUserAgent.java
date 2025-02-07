package org.jsoup.helper;

public class GeneratedTestUserAgent {

    @Test
    public void testUserAgent() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setUserAgent("Example User Agent");
        assertEquals("Example User Agent", connection.get().getUserAgent());
    }

}