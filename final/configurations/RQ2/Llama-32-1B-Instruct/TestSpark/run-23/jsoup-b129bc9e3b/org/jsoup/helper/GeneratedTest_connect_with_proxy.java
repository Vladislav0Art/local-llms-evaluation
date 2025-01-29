package org.jsoup.helper;

public class GeneratedTest_connect_with_proxy {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_connect_with_proxy() {
        Proxy proxy = new Proxy(Proxy.Type.SOCKS_4, new InetSocketAddress("localhost", 8080));
        Connection connection = HttpConnection.connect("https://www.example.com?proxy=" + proxy);
        assertNotNull(connection);
        assertEquals(HOST, connection.getHost());
        assertEquals(PORT, connection.getPort());
    }

}