package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyValueWithNullConnection {

    @Test
    public void testAppendKeyValueWithNullConnection() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal(null, "");
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Expected UnsupportedOperationException");
        }
    }

}