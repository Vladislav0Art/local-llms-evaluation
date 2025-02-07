package org.jsoup.helper;

public class GeneratedTestCookie {

    @Test
    public void testCookie() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) HttpConnection.connect("https://example.com");
        String cookieName = "session";
        String cookieValue = "value";
        connection.addHeader(cookieName, cookieValue);
        assertEquals(200, connection.getResponseCode());
    }

}