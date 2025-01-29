package org.jsoup.helper;

public class GeneratedTestReferrer {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testReferrer() throws IOException {
        String referrer = "http://other.example.com";
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertEquals(referrer, (String) httpConnection.referrer());
    }

}