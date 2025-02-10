package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestProxyNullHost {

    @Test
    public void testProxyNullHost() {
        String host = null;
        int port = 8080;
        Connection conn = HttpConnection.proxy(host, port);
        assertNull(conn);
    }

}