package org.jsoup.helper;

public class GeneratedConnect[Proxy]

Test {

    @Test
    public void connect[ Proxy]Test() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080));
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
    }

}