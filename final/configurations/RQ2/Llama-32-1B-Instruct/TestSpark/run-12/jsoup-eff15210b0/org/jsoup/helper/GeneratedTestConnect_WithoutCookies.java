package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestConnect_WithoutCookies {

    private HttpConnection connection;
    private URL url;

    @Before
    public void setup() {
        url = new URL("https://example.com");
    }

    @Test
    public void testConnect_WithoutCookies() throws Exception {
        String cookieStore = null;
        connection = HttpConnection.connect(url, cookieStore);
        assertTrue(connection instanceof Connection);
    }

}