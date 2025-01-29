package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnectWithProxy() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new Proxy(URI.create("http://example.com:8080"), URI.create("https://example.com")));
        assertEquals("http://example.com:8080", connection.connect(URL).getUri().toString());
    }

}