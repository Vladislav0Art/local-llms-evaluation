package org.jsoup.helper;

public class GeneratedTestProxy {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testProxy() throws IOException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnlocalHost("localhost"));
        httpConnection = HttpConnection.connect(proxy);
        Assert.assertTrue(httpConnection == httpConnection);
    }

}