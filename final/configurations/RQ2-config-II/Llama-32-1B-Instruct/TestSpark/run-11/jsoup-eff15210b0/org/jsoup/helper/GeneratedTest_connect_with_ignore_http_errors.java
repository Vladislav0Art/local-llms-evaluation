package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest_connect_with_ignore_http_errors {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_connect_with_ignore_http_errors() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        assertEquals(false, connection.ignoreHttpErrors(true));
        assertEquals(false, connection.ignoreHttpErrors(false));
    }

}