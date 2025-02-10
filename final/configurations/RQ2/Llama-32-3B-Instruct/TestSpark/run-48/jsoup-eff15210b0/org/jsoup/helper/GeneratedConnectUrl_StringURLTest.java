package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedConnectUrl_StringURLTest {

    @Test
    public void connectUrl_StringURLTest() {
        Connection conn = HttpConnection.connect(new URL("http://example.com"))
        assertNotNull(conn)
    }

}