package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest_connect {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_connect() {
        Connection connection = HttpConnectionTest.connect("http://example.com");
        assertEquals(null, connection.get());
    }

}