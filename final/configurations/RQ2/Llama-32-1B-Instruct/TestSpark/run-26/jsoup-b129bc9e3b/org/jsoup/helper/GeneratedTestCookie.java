package org.jsoup.helper;

public class GeneratedTestCookie {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testCookie() throws IOException {
        String url = "https://www.example.com";
        CookieManager cookieManager = new CookieManager();
        httpConnection.setCookieStore(cookieManager);
        Connection connection = httpConnection.connect(url);
        CookieStore cookieStore = connection.cookieStore();
        assertNotNull(cookieStore);
        assertEquals(2, cookieStore.getEntries().size());
    }

}