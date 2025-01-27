package org.jsoup.helper;

public class GeneratedConnectWithProxy_ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void connectWithProxy_ReturnsCorrectInstance() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection connection = HttpConnection.connect(proxy);
        assertNotNull(connection);
    }

}