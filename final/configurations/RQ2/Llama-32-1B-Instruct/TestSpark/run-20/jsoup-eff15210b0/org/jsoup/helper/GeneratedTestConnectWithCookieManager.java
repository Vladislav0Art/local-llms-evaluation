package org.jsoup.helper;

public class GeneratedTestConnectWithCookieManager {

    @Test
    public void testConnectWithCookieManager() {
        CookieManager cookieManager = new DefaultCookieManager();
        String cookieStorePath = "path/to-cookie-store";
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        CookieStore cookieStore = cookieManager.getCookieStore(cookieStorePath);
        assert connection != null;
    }

}