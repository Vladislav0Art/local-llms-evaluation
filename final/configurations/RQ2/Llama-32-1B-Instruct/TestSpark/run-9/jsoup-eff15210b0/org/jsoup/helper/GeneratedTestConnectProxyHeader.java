package org.jsoup.helper;

public class GeneratedTestConnectProxyHeader {

    @Test
    public void testConnectProxyHeader() {
        TestHttpConnection connection = new TestHttpConnection();
        Proxy proxy = new MockProxy("example.com", 8080);
        TestHttpConnection proxiedConn = new TestHttpConnection(proxy);
        assertEquals(proxiedConn, connection.proxy(new MockHeader("Host", "example.com")));
    }

}