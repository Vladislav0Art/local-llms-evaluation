package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest_connect_with_cookie {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_connect_with_cookie() throws IOException {
        String cookie = "JSESSIONID=1234567890abcdef; Path=/path";
        CookieManager cookieManager = new DefaultCookieManager();
        cookieManager.setCookies(Collections.singletonMap(COOKIE_NAME, cookie));
        HttpConnection connection = new Connection(new URL("http://example.com"), COOKIE_MANAGER);
        connection.setCookieStore(cookieManager);
        assertEquals(null, connection.get());
    }

}