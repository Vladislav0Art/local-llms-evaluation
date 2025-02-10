package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "http://example.com";
        Connection conn = HttpConnection.connect(url);
        assertNotNull(conn);
    }

}