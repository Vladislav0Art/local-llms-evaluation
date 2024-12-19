package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestAppendKeyVal_urlBuilder_multiple_keys {

    @Test
    public void testAppendKeyVal_urlBuilder_multiple_keys() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal key1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal key2 = new Connection.KeyVal("key2", "value2");
        urlBuilder.appendKeyVal(key1);
        urlBuilder.appendKeyVal(key2);
        String expectedUrl = "https://example.com?key1=value1&key2=value2";
        assertEquals(expectedUrl, urlBuilder.build());
    }

}