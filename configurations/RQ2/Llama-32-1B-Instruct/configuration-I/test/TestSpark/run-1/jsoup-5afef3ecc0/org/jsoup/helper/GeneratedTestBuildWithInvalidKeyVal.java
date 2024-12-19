package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestBuildWithInvalidKeyVal {

    @Test
    public void testBuildWithInvalidKeyVal() {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal(null);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}