package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestUrlBuilderAppendKeyValEmptyValue {

    @Test
    public void testUrlBuilderAppendKeyValEmptyValue() throws UnsupportedEncodingException {
        String url = "https://www.example.com";
        UrlBuilder builder = new UrlBuilder(url);
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("", ""));
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

}