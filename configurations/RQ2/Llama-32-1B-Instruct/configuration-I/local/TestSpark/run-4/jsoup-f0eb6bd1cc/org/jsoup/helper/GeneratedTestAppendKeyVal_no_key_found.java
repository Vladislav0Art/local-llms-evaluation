package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_no_key_found {

    @Test
    public void testAppendKeyVal_no_key_found() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal();
        assertEquals("https://example.com", urlBuilder.appendKeyVal(keyVal).toString());
    }

}