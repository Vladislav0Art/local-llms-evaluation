package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendMultipleKeyValue {

    @Test
    public void testAppendMultipleKeyValue() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        urlBuilder.appendKeyVal("key1", "value1");
        urlBuilder.appendKeyVal("key2", "value2");
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com?key1=value1&key2=value2", actualUrl.toString());
    }

}