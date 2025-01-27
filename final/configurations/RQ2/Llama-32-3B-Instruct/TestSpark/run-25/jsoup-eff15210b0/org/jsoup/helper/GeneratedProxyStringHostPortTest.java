package org.jsoup.helper;

public class GeneratedProxyStringHostPortTest {

    @Test
    public void proxyStringHostPortTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection proxy = connection.proxy("http://localhost:8080");
        assertNotNull(proxy);
    }

}