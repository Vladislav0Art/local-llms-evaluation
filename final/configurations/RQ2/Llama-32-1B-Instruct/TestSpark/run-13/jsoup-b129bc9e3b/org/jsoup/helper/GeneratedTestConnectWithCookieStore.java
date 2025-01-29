package org.jsoup.helper;

public class GeneratedTestConnectWithCookieStore {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnectWithCookieStore() throws IOException {
        HttpConnection connection = new HttpConnection();
        CookieManager cookieManager = new CookieManager();
        String cookie = "value";
        cookieManager.addCookie(new java.net.Cookie("name", cookie));
        connection.setCookieStore(cookieManager);
        assertEquals("http://example.com", connection.connect(URL).getUri().toString());
    }

}