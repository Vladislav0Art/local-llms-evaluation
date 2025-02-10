package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedUrlString_StringURLTest {

    @Test
    public void urlString_StringURLTest() {
        String url = "http://example.com"
        Connection conn = HttpConnection.url(url as String ?)
        assertNotNull(conn)
    }

}