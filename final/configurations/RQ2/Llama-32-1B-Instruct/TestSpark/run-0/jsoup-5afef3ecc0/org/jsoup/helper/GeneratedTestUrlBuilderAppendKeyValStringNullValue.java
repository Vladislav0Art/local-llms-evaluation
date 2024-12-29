package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestUrlBuilderAppendKeyValStringNullValue {

    @Test
    public void testUrlBuilderAppendKeyValStringNullValue() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal(null, null));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

}