package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyValueWithEmptyConnection {

    @Test
    public void testAppendKeyValueWithEmptyConnection() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal("key", "");
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Expected UnsupportedOperationException");
        }
    }

}