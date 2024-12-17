package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        String url = "http://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder(url);
        System.out.println(builder.toString());
    }

}