package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_Malformed Kv {

    @Test
    public void testAppendKeyVal_Malformed

    Kv() {
        KeyVal kv = new KeyVal("key", "value");
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}