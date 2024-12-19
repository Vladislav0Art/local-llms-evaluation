package org.jsoup.helper;

public class GeneratedTestProxy {

    private Connection connection;
    private URL url;

    @Test
    public void testProxy() {
        url = new URL("https://example.com");
        proxy = new Proxy("localhost:8080");
        connection = HttpConnection.connect(proxy, url);
        assertEquals(proxy, connection.getProxy());
    }

}