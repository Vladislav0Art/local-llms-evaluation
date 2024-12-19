package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendInvalidKeyValue {

    @Test
    public void testAppendInvalidKeyValue() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal("key", "value");
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}