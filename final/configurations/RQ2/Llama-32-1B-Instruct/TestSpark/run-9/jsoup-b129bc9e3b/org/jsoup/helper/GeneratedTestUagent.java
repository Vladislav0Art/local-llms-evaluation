package org.jsoup.helper;

public class GeneratedTestUagent {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testUagent() throws IOException {
        String userAgent = "Example User Agent";
        httpConnection = HttpConnection.connect(new Request(null));
        Assert.assertEquals(userAgent, (String) httpConnection.userAgent());
    }

}