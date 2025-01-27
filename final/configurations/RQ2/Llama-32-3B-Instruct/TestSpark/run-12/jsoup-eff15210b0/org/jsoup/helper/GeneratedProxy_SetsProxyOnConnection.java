package org.jsoup.helper;

public class GeneratedProxy_SetsProxyOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void proxy_SetsProxyOnConnection() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection connection = HttpConnection.proxy(proxy);
        assertEquals(proxy, connection.getProxy());
    }

}