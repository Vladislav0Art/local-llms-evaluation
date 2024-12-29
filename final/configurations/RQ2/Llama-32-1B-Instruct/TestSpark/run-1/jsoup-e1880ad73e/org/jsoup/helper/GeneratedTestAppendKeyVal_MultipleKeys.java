package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAppendKeyVal_MultipleKeys {

    @Test
    public void testAppendKeyVal_MultipleKeys() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String key1 = "test1";
        String key2 = "test2";
        urlBuilder.appendKeyVal(java.util.Map.of(key1, "value1", key2, "value2"));
        assertEquals("http://example.com/test1=value1/test2=value2", urlBuilder.build().toString());
    }

}