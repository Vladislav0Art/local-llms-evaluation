package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValWithNonStringValue {

    @Test
    public void testAppendKeyValWithNonStringValue() throws UnsupportedEncodingException {
        String inputKey = "key";
        int value = 123;
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(value);
        fail("Expected UnsupportedEncodingException");
    }

}