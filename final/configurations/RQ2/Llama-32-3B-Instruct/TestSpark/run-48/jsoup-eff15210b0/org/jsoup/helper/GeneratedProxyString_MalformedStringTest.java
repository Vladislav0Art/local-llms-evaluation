package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedProxyString_MalformedStringTest {

    @Test
    public void proxyString_MalformedStringTest() {
        String host = "example "
        int port = 8080
        Connection conn = HttpConnection.proxy(host, port)
        assertNull(conn)
    }

}