package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedUrl_URL_UrlTest {

    @Test
    public void url_URL_UrlTest() {
        URL url = new URL("http://example.com")
        Connection conn = HttpConnection.url(url as URL ?)
        assertNotNull(conn)
    }

}