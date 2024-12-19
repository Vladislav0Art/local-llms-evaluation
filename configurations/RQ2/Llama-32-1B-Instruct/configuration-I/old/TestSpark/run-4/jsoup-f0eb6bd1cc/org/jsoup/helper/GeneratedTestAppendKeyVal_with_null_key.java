package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_with_null_key {

    @Test
    public void testAppendKeyVal_with_null_key() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = null;
        assertEquals("https://example.com?key=value", urlBuilder.appendKeyVal(keyVal).toString());
    }

}