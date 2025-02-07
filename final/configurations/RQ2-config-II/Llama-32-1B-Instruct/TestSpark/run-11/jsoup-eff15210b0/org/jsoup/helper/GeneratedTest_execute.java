package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest_execute {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_execute() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Document document = (Document) connection.getResponse();
        assertEquals(200, document.header("X-Frame-Options").toInt());
        assertEquals(443, document.header("X-XSS-Protection").toInt());
    }

}