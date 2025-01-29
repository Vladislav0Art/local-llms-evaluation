package org.jsoup.helper;

public class GeneratedTestConnectWithMultipleProxies {

    @Test
    public void testConnectWithMultipleProxies() {
        String[] proxies = {"http://proxy1.example.com", "http://proxy2.example.com"};
        Proxy[] proxiesArray = new Proxy[proxies.length];
        for (int i = 0; i < proxies.length; i++) {
            proxiesArray[i] = new Proxy(Proxy.Type.HTTP, java.net.InetSocketAddress.createSocket(proxies[i], 8080));
        }
        Connection connection = HttpConnection.connect(new URL("http://example.com"), proxiesArray);
        assert connection != null;
    }

}