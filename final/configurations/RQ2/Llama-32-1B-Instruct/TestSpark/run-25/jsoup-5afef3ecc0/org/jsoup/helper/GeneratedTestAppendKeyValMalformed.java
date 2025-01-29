package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValMalformed {

    @Test
    public void testAppendKeyValMalformed() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        try {
            builder.appendKeyVal(new org.jsoup.KeyVal("key", "value"));
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        }
    }

}