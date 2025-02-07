package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;

public class GeneratedTest_connect_with_https {

    private static final CookieManager COOKIE_MANAGER = new DefaultCookieManager();
    private static final String COOKIE_NAME = "my_cookie";

    public Connection connect(String url) {
        return new Connection(new URL(url), COOKIE_MANAGER);
    }

    @Test
    public void test_connect_with_https() throws IOException {
        String url = "https://example.com";
        HttpsURLConnection httpsConnection = (HttpsURLConnection) new Connection(url, null).getResponse();
        assertEquals(443, httpsConnection.getHttpProtocolVersion().toInt());
        assertEquals("UTF-8", HTTPSURLConnection.UTF_8);
    }

}