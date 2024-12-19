package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_multiple_keys {

    @Test
    public void testAppendKeyVal_multiple_keys() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal1 = new Connection.KeyVal();
        Connection.KeyVal keyVal2 = new Connection.KeyVal("key", "value");
        assertEquals("https://example.com?key=0&key=value", urlBuilder.appendKeyVal(keyVal1).appendKeyVal(keyVal2).toString());
    }

}