package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_empty_string_value {

    @Test
    public void testAppendKeyVal_empty_string_value() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal();
        assertEquals("https://example.com?key=value", urlBuilder.appendKeyVal(keyVal).toString());
    }

}