package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_appendKeyVal_withUrl {

    @Test
    public void test_appendKeyVal_withUrl() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder(new URI("http://example.com/path/to/resource"));
        builder.appendKeyVal(new org.jsoup.KeyVal(key, value));
        URL url = builder.build();
        assertEquals("http://example.com/path/to/resource?key=value", url.toString());
    }

}