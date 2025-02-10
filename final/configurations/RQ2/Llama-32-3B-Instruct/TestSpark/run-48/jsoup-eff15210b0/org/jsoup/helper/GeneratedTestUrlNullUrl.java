package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestUrlNullUrl {

    @Test
    public void testUrlNullUrl() {
        String url = null;
        URL u = new URL(url);
        assertNull(u);
    }

}