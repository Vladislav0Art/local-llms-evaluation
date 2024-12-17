package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_empty_key {

    @Test
    public void testAppendKeyVal_empty_key() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal();
        assertEquals("https://example.com?key=value", urlBuilder.appendKeyVal(keyVal).toString());
    }

}