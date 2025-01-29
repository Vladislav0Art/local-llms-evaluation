package org.jsoup.helper;

public class GeneratedTestConnectProxyMethod {

    @Test
    public void testConnectProxyMethod() {
        TestHttpConnection connection = new TestHttpConnection();
        Proxy proxy = new MockProxy("example.com", 8080);
        TestHttpConnection proxiedConn = new TestHttpConnection(proxy);
        assertEquals(proxiedConn, connection.proxy(proxy));
    }

}