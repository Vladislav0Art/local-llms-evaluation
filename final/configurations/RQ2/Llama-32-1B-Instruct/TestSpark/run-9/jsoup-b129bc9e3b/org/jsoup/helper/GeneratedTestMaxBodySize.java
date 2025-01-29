package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testMaxBodySize() throws IOException {
        int maxBytes = 1024 * 10;
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertEquals(2048, (int) httpConnection.maxBodySize(maxBytes));
    }

}