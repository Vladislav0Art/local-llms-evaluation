package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        String proxyHost = "proxy.example.com";
        int proxyPort = 8080;
        Proxy proxy = new Proxy(Proxy.Type.HTTP, java.net.InetSocketAddress.createSocket(proxyHost, proxyPort));
        Connection connection = HttpConnection.connect(new URL("http://example.com"), proxy);
        assert connection != null;
    }

}