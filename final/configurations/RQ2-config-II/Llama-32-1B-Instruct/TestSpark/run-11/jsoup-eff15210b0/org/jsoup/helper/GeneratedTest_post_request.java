package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest_post_request {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_post_request() throws IOException {
        String url = "http://example.com";
        HttpConnection connection = new Connection(url, null, null);
        Request request = new Request();
        Document document = (Document) connection.getResponse();
        assertEquals(201, document.header("Location").toInt());
        assertEquals(null, document.post().getResponse());
    }

}