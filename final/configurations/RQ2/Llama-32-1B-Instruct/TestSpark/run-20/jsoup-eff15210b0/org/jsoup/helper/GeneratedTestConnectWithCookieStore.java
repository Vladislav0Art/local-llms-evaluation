package org.jsoup.helper;

public class GeneratedTestConnectWithCookieStore {

    @Test
    public void testConnectWithCookieStore() {
        CookieStore cookieStore = new DefaultCookieStore();
        String cookieStorePath = "path/to_cookie-store";
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        cookieStore.setCookies(cookieStorePath);
        assert connection != null;
    }

}