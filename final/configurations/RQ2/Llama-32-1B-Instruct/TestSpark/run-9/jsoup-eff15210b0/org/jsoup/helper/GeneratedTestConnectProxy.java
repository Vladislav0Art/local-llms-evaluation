package org.jsoup.helper;

public class GeneratedTestConnectProxy {

    @Test
    public void testConnectProxy() {
        TestHttpConnection connection = new TestHttpConnection();
        Proxy proxy = new MockProxy("example.com", 8080);
        TestHttpConnection proxiedConn = new TestHttpConnection(proxy);
        assertEquals(proxiedConn, connection.connect(proxy));
    }

}