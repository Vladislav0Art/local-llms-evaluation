package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAppendKeyValAddsKeyValueToUrlQuery {

    @Test
    public void appendKeyValAddsKeyValueToUrlQuery() {
        String key = "key";
        String value = "value";
        String inputUrl = "https://example.com/path?key=value";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("key=value", urlBuilder.appendKeyVal(new org.apache.http.HttpHost("example.com", 443, null)).toString());
    }

}