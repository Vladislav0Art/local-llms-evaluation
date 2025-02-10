package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedProxyString_StringHostPortTest {

    @Test
    public void proxyString_StringHostPortTest() {
        String host = "example.com"
        int port = 8080
        Connection conn = HttpConnection.proxy(host, port)
        assertNotNull(conn)
    }

}