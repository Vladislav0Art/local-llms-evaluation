package org.jsoup.helper;

public class GeneratedTestConnectsWithCookies {

    @Test
    public void testConnectsWithCookies() {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        CookieManager cookieManager = new DefaultCookieManager();
        cookieManager.addCookie("test", "value");
        assert connection.connect(url, cookieManager) != null;
    }

}