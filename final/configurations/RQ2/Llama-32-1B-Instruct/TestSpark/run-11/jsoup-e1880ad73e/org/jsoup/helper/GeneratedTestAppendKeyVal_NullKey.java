package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NullKey {

    @Test
    public void testAppendKeyVal_NullKey() {
        KeyVal kv = null;
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}