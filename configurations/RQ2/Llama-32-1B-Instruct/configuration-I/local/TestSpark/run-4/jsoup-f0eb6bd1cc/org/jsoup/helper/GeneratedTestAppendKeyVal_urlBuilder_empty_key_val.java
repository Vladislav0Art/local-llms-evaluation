package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_urlBuilder_empty_key_val {

    @Test
    public void testAppendKeyVal_urlBuilder_empty_key_val() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedUrl = "https://example.com";
        urlBuilder.appendKeyVal(new Connection.KeyVal());
        assertEquals(expectedUrl, urlBuilder.build());
    }

}