package org.jsoup.helper;

public class GeneratedTestConnectWithCookie {

    @Test
    public void testConnectWithCookie() {
        CookieManager cookieManager = new DefaultCookieManager();
        CookieStore cookieStore = new SessionCookieStore();
        HttpConnection connection = org.jsoup.helper.HttpConnection.connect(new URL("http://example.com"), cookieManager, cookieStore);
        assertEquals("http://example.com", connection.getURL());
    }

}