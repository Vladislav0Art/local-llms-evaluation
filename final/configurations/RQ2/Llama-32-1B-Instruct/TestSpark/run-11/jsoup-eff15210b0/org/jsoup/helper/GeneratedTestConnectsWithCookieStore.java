package org.jsoup.helper;

public class GeneratedTestConnectsWithCookieStore {

    @Test
    public void testConnectsWithCookieStore() throws Exception {
        HttpConnection connection = new HttpConnection();
        CookieManager cm = new DefaultCookieManager();
        cm.addCookie(new Cookie("cookie_name", cookie, cookie.getDomain(), true));
        String url = "http://example.com";
        assert connection.connect(url);
    }

}