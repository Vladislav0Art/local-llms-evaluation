package org.jsoup.helper;

public class GeneratedProxy_ReturnsProxyRequest {

    @Test
    public void proxy_ReturnsProxyRequest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}