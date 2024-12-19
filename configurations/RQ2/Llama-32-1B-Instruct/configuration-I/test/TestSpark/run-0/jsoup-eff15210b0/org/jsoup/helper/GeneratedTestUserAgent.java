package org.jsoup.helper;

public class GeneratedTestUserAgent {

    private Connection connection;
    private URL url;

    @Test
    public void testUserAgent() {
        user_agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
        connection = HttpConnection.connect();
        assertEquals(user_agent, connection.getUserAgent());
    }

}