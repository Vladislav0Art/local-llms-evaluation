package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestUrl {

    @Test
    public void testUrl() {
        URL url = new URL("http://example.com");
        Connection conn = HttpConnection.url(url);
        assertNotNull(conn);
    }

}