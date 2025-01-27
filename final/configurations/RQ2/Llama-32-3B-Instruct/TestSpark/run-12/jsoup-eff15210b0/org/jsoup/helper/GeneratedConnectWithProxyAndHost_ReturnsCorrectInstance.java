package org.jsoup.helper;

public class GeneratedConnectWithProxyAndHost_ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void connectWithProxyAndHost_ReturnsCorrectInstance() {
        String host = "localhost";
        int port = 8080;
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        Connection connection = HttpConnection.connect(proxy);
        assertNotNull(connection);
    }

}