package org.jsoup.helper;

public class Generated[proxy][ReturnsProxyConnection]

Test {

    @Test
    public void [proxy][ReturnsProxyConnection]Test() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080));
        Connection connection = HttpConnection.proxy(proxy);
        Assert.assertNotNull(connection);
    }

}