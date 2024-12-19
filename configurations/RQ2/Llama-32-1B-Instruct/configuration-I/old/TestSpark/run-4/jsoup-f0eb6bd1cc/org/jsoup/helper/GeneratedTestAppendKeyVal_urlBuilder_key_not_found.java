package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_urlBuilder_key_not_found {

    @Test
    public void testAppendKeyVal_urlBuilder_key_not_found() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        String expectedUrl = "https://example.com?key=value";
        urlBuilder.appendKeyVal(keyVal);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}