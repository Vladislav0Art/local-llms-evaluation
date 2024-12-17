package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestUrlBuilderWithQueryAndFragment {

    @Test
    public void testUrlBuilderWithQueryAndFragment() {
        String url = "http://example.com/path/to/resource?query=hello&fragment=world";
        UrlBuilder builder = new UrlBuilder(url);
        System.out.println(builder.toString());
    }

}