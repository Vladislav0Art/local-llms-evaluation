package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValWithNull {

    @Test
    public void testAppendKeyValWithNull() throws UnsupportedEncodingException {
        String inputKey = "key";
        int value = null;
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(value);
        fail("Expected NullPointerException");
    }

}