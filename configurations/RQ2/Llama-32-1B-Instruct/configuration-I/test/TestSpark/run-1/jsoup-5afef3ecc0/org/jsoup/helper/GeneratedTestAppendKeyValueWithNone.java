package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyValueWithNone {

    @Test
    public void testAppendKeyValueWithNone() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        urlBuilder.appendKeyVal("key", null);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com?key=null", actualUrl.toString());
    }

}