package org.jsoup.helper;

public class GeneratedTestConnectsWithCookie {

    @Test
    public void testConnectsWithCookie() throws Exception {
        HttpConnection connection = new HttpConnection();
        String cookie = "JSESSIONID=1234567890";
        CookieManager cm = new DefaultCookieManager();
        cm.addCookie(new Cookie("cookie_name", cookie, cookie.getDomain(), true));
        String url = "http://example.com";
        assert connection.connect(url);
    }

}