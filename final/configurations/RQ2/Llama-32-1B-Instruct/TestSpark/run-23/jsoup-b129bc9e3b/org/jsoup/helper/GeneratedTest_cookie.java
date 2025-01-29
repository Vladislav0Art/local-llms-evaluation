package org.jsoup.helper;

public class GeneratedTest_cookie {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_cookie() {
        String cookies = "JSESSIONID=junk; JSESSIONID=another-junk";
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookieStore(new CookieStore(cookieManager));
        URL url = new URL("https://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertEquals(HOST, connection.getHost());
    }

}