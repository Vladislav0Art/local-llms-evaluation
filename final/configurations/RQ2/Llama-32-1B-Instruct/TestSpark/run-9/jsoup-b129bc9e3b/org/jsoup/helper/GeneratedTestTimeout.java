package org.jsoup.helper;

public class GeneratedTestTimeout {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testTimeout() throws IOException {
        int timeoutMs = 1000;
        httpConnection = HttpConnection.connect("https://example.com", 1000);
        Assert.assertTrue(httpConnection.timeout(timeoutMs));
    }

}