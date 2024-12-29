package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.ConnectionBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestUrlJoinWithoutQuery {

    @Test
    public void testUrlJoinWithoutQuery() {
        String url = "https://example.com/path";
        Document document = Jsoup.parse(url);
        assertEquals("https://example.com/path", document.selectFirst("a").attr("href"));
    }

}