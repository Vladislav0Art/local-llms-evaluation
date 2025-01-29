package org.jsoup.helper;

public class GeneratedTestUrl {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testUrl() throws IOException {
        Document document = new Document();
        Assert.assertEquals("https://example.com", httpConnection.url(document));
    }

}