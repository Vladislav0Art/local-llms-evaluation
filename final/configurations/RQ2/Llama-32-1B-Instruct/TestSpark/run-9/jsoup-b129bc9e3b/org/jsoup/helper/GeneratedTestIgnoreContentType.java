package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testIgnoreContentType() throws IOException {
        boolean ignoreContentType = false;
        httpConnection = HttpConnection.connect("https://example.com", ignoreContentType);
        Assert.assertFalse(httpConnection.ignoreContentType(ignoreContentType));
    }

}