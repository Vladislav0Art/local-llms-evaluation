package org.jsoup.helper;

public class GeneratedTestConnectMethodWithProxy {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testConnectMethodWithProxy() throws IOException {
        String proxyUrl = "http://proxy.example.com";
        httpConnection = HttpConnection.connect(proxyUrl);
        Assert.assertTrue(httpConnection == httpConnection);
    }

}