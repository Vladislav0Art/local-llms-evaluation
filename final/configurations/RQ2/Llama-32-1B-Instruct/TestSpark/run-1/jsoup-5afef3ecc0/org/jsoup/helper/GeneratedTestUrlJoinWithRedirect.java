package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestUrlJoinWithRedirect {

    @Test
    public void testUrlJoinWithRedirect() throws Exception {
        URI uri = new URI("https://example.com/path");
        String redirectedUrl = uri.toString();
        assertEquals("https://redirected.example.com/path", redirectedUrl);
    }

}