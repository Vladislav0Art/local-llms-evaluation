package org.jsoup.helper;

public class GeneratedTestConnect {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnect() throws IOException {
        HttpConnection connection = new HttpConnection();
        assertEquals(URL, connection.connect(URL).getUri().toString());
    }

}