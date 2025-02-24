package org.jsoup.helper;

public class GeneratedTestProxy {

    private HttpConnection httpConnection;

    @BeforeEach
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testProxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
        httpConnection.proxy(proxy);
        assertEquals(proxy, httpConnection.proxy());
    }

}