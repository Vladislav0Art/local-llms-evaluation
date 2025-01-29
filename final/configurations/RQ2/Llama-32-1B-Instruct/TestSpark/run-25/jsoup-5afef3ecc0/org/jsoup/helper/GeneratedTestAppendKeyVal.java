package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String inputKey = "key";
        String inputValue = "value";
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(new org.jsoup.KeyVal(inputKey, inputValue));
        String expectedUrl = "https://example.com?key=value";
        assertEquals(expectedUrl, builder.build().toString());
    }

}