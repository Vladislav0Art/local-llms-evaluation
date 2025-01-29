package org.jsoup.helper;

public class GeneratedTestConnectWithCookie {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnectWithCookie() throws IOException {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new LinkedHashMap<>();
        cookies.put(COOKIE_NAME, "value");
        connection.setCookies(cookies);
        assertEquals("http://example.com", connection.connect(URL).getUri().toString());
    }

}