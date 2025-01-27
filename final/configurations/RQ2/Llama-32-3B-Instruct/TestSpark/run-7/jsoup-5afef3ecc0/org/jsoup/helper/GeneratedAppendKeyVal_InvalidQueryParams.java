package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendKeyVal_InvalidQueryParams {

    @Test
    public void appendKeyVal_InvalidQueryParams() {
        // Not covered by mocking
        try {
            Connection.KeyVal kv = new Connection.KeyVal("key", "&");
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
        } catch (UnsupportedEncodingException e) {
            assertEquals("UTF-8 encoding not supported for query parameter", e.getMessage());
        }
    }

}