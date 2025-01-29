package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestConnect_WithCookies {

    private HttpConnection connection;
    private URL url;

    @Before
    public void setup() {
        url = new URL("https://example.com");
    }

    @Test
    public void testConnect_WithCookies() throws Exception {
        CookieManager cookieManager = new CookieManager();
        connection = HttpConnection.connect(url, cookieManager);
        assertTrue(connection instanceof Connection);
    }

}