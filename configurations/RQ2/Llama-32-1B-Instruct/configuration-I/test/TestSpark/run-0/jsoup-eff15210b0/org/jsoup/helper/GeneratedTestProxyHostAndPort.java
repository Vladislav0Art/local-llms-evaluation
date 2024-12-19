package org.jsoup.helper;

public class GeneratedTestProxyHostAndPort {

    private Connection connection;
    private URL url;

    @Test
    public void testProxyHostAndPort() {
        url = new URL("https://example.com");
        proxy = new Proxy("localhost:8080");
        connection = HttpConnection.connect(proxy, url);
        assertEquals("http", connection.getProxy().toString().substring(7));
    }

}