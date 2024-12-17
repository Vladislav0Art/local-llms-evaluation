package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestUrlBuilderAppendKeyVal_EmptyString {

    @Test
    public void testUrlBuilderAppendKeyVal_EmptyString() {
        String key = "";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new java.net.URL("http://example.com"));
        builder.appendKeyVal(java.util.Map.Entry.ofNullable(key, value));
        assertEquals("http%3A%2F%2Fexample.com", builder.build().toString());
    }

}