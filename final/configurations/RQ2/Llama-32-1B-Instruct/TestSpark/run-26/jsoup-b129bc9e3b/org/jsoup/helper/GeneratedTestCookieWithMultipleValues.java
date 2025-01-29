package org.jsoup.helper;

public class GeneratedTestCookieWithMultipleValues {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testCookieWithMultipleValues() throws IOException {
        String url = "https://www.example.com";
        CookieManager cookieManager = new CookieManager();
        httpConnection.setCookieStore(cookieManager);
        Connection connection = httpConnection.connect(url);
        CookieStore cookieStore = connection.cookieStore();
        assertNotNull(cookieStore);
        assertEquals(3, cookieStore.getEntries().size());
    }

}