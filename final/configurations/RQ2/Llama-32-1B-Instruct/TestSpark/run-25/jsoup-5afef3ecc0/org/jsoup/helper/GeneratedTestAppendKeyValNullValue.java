package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValNullValue {

    @Test
    public void testAppendKeyValNullValue() throws UnsupportedEncodingException {
        String inputKey = "key";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(null);
        fail("Expected NullPointerException");
    }

}