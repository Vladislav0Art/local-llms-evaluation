package org.jsoup.helper;

public class GeneratedUserAgent_SetUserAgentHeader {

    @Test
    public void userAgent_SetUserAgentHeader() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}