package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestProxyNullPort {

    @Test
    public void testProxyNullPort() {
        String host = "example.com";
        int port = null;
        Connection conn = HttpConnection.proxy(host, port);
        assertNull(conn);
    }

}