package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_with_invalid_key {

    @Test
    public void testAppendKeyVal_with_invalid_key() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", 123);
        assertEquals("https://example.com?invalidkey=0&value=123", urlBuilder.appendKeyVal(keyVal).toString());
    }

}