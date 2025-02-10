package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestConnectNullUrl {

    @Test
    public void testConnectNullUrl() {
        String url = null;
        Connection conn = HttpConnection.connect(url);
        assertNull(conn);
    }

}