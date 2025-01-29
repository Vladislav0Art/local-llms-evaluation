package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testConnectConnect() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.connect("https://example.com"));
    }

    @Test
    public void testConnectURL() {
        TestHttpConnection connection = new TestHttpConnection();
        URL url = "https://example.com";
        Connection conn = connection.connect(url);
        assertEquals(conn, connection.url(url));
    }

    @Test
    public void testConnectProxy() {
        TestHttpConnection connection = new TestHttpConnection();
        Proxy proxy = new MockProxy("example.com", 8080);
        TestHttpConnection proxiedConn = new TestHttpConnection(proxy);
        assertEquals(proxiedConn, connection.connect(proxy));
    }

    @Test
    public void testConnectUrlString() {
        TestHttpConnection connection = new TestHttpConnection();
        String url = "https://example.com";
        Connection conn = connection.url(url);
        assertEquals(conn, connection.url("https://example.com"));
    }

    @Test
    public void testConnectProxyMethod() {
        TestHttpConnection connection = new TestHttpConnection();
        Proxy proxy = new MockProxy("example.com", 8080);
        TestHttpConnection proxiedConn = new TestHttpConnection(proxy);
        assertEquals(proxiedConn, connection.proxy(proxy));
    }

    @Test
    public void testConnectProxyHeader() {
        TestHttpConnection connection = new TestHttpConnection();
        Proxy proxy = new MockProxy("example.com", 8080);
        TestHttpConnection proxiedConn = new TestHttpConnection(proxy);
        assertEquals(proxiedConn, connection.proxy(new MockHeader("Host", "example.com")));
    }

    @Test
    public void testConnectTimeout() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(10000, connection.timeout(0));
    }

    @Test
    public void testConnectMaxBodySize() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(1024 * 10, connection.maxBodySize(10240));
    }

    @Test
    public void testFollowRedirects() {
        TestHttpConnection connection = new TestHttpConnection();
        assertTrue(connection.followRedirects(true));
    }

    @Test
    public void testReferrer() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("", connection.referrer(""));
    }

    @Test
    public void testIgnoreHttpErrors() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(1, connection.ignoreHttpErrors(true));
    }

    @Test
    public void testIgnoreContentType() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(0, connection.ignoreContentType(false));
    }

    @Test
    public void testData() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data("key", "value"));
    }

    @Test
    public void testSslSocketFactory() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.sslSocketFactory("test", 443));
    }

    @Test
    public void testDataString() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data(new String[]{"key", "value"}));
    }

    @Test
    public void testDataMap() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data(new LinkedHashMap<>() {{
            put("key1", "value1");
            put("key2", "value2");
        }}));
    }

    @Test
    public void testKeyVal() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.data(new String[]{"key1", "value1"}));
    }

    @Test
    public void testRequest() {
        TestHttpConnection connection = new TestHttpConnection();
        Connection request = connection.request(Request.newBuilder().build());
        assertEquals(request, connection.request(request));
    }

    @Test
    public void testPostDataCharset() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals("https://example.com", connection.postDataCharset("utf-8"));
    }
}

class MockProxy implements Proxy {
    private String host;
    private int port;

    public MockProxy(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public int getPort() {
        return port;
    }
}

class MockHeader implements Header {
    private String name;

    public MockHeader(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return "";
    }

}