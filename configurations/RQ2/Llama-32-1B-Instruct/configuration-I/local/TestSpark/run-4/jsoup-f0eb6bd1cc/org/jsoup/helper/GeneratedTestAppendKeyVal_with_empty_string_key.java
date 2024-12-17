package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_with_empty_string_key {

    @Test
    public void testAppendKeyVal_with_empty_string_key() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "");
        assertEquals("https://example.com?key=0&key=value", urlBuilder.appendKeyVal(keyVal).toString());
    }

}