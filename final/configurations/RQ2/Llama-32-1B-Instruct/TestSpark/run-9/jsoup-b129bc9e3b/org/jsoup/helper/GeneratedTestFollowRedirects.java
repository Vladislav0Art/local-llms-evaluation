package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testFollowRedirects() throws IOException {
        boolean followRedirects = true;
        httpConnection = HttpConnection.connect("https://example.com", followRedirects);
        Assert.assertTrue(httpConnection.followRedirects(followRedirects));
    }

}