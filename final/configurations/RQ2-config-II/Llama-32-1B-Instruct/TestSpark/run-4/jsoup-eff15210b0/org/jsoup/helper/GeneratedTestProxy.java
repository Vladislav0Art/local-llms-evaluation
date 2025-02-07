package org.jsoup.helper;

public class GeneratedTestProxy {

    @Test
    public void testProxy() {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection.setProxy(new org.jsoup_proxy.Proxy(new InetSocketAddress("localhost", 8080)));
        assertEquals("http://localhost:8080", connection.get().getURI());
    }

}