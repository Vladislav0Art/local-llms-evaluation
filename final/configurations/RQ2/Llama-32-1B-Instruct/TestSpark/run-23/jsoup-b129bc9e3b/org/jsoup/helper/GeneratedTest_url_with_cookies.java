package org.jsoup.helper;

public class GeneratedTest_url_with_cookies {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_url_with_cookies() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookieStore(new CookieStore(cookieManager));
        URL url = new URL("https://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertEquals(HOST, connection.getHost());
    }

}