package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.KeyVal;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_MalformedKv {

    @Test
    public void testAppendKeyVal_MalformedKv() throws UnsupportedEncodingException {
        KeyVal kv = new KeyVal();
        try {
            UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
            urlBuilder.appendKeyVal(kv);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}