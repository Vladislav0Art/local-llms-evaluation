package org.jsoup.helper;

public class GeneratedTestDataWithCookieStore {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testDataWithCookieStore() throws IOException {
        CookieStore cookieStore = new CookieManager();
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertTrue(httpConnection.cookieStore(cookieStore));
    }

}