package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyValueWithEmptyUrl {

    @Test
    public void testAppendKeyValueWithEmptyUrl() throws Exception {
        final Document document = new Document();
        String urlString = "";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal("key", "");
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Expected UnsupportedOperationException");
        }
    }

}