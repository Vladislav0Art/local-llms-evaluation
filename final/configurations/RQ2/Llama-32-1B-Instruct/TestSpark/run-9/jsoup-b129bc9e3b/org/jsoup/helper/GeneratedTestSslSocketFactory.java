package org.jsoup.helper;

public class GeneratedTestSslSocketFactory {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testSslSocketFactory() throws IOException {
        SSLSocketFactory sslSocketFactory = new SSLSocketFactory();
        httpConnection = HttpConnection.connect("https://example.com", sslSocketFactory);
        Assert.assertEquals(SSLContext.getDefault(), (javax.net.ssl.SSLContext) httpConnection.sslSocketFactory());
    }

}